package array_list.quan_ly_san_pham;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageUser {

    ArrayList<User> users = new ArrayList<>();
    User user;

    String menu1 = """
            ====================MENU====================
            1.                ĐĂNG NHẬP                 | 
            2.                ĐĂNG KÝ                   |
            0.               >>>THOÁT<<<                |
            --------------------------------------------
            """;

    String menu2 =  """
            ==================QUẢN LÝ===================
            1.      ĐẾN TRANG QUẢN LÝ SẢN PHẨM          | 
            2.          THÔNG TIN TÀI KHOẢN             |
            0.            >>>ĐĂNG XUẤT<<<               |
            --------------------------------------------
            """;

    String menu3 = """
            =================TÀI KHOẢN==================
            1.           HIỂN THỊ TÀI KHOẢN             | 
            2.           CHỈNH SỬA MẬT KHẨU             |
            0.              >>>THOÁT<<<                 |
            --------------------------------------------
            """;

    public ManageUser(ArrayList<User> users) {
        this.users = users;
    }

    public ManageUser() {
    }

    Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println(this.menu1);
            System.out.print("Nhập lựa chọn >>> ");
            int choice = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------");

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    System.out.println("Mời Bạn Đăng Ký >>>");
                    registration();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Xin lựa chọn từ 0 => 2");
            }
        }
    }

    public void login() {
        System.out.println("Mời bạn đăng nhập >>>");
        System.out.print("Tên Đăng Nhập: ");
        String name = sc.nextLine();
        System.out.print("Mật Khẩu: ");
        String pass = sc.nextLine();

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(name) && users.get(i).getPass().equals(pass)) {
                System.out.println(">>>ĐĂNG NHẬP THÀNH CÔNG<<<");
                user = new User(name, pass);
                manage();
                return;
            }
        }
        System.out.println("Tài Khoản Không Tồn Tại!!!");
        menu();
    }

    public void registration() {
        System.out.print("Nhập Tên Đăng Nhập: ");
        String name = sc.nextLine();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(name)) {
                System.out.println("Trùng Tên Tài Khoản.\nNhập lại>>");
                registration();
                break;
            }
        }
        System.out.print("Nhập Mật Khẩu: ");
        String pass = sc.nextLine();
        String pass1 = null;

        while (pass != pass1) {
            System.out.print("Nhập Lại Mật Khẩu: ");
            pass1 = sc.nextLine();
            if (pass.equals(pass1)) {
                System.out.println(">>>ĐĂNG KÝ THÀNH CÔNG<<<");
                User user = new User(name, pass);
                users.add(user);
                menu();
                break;
            }
        }
    }

    public void manage() {
        while (true) {
            System.out.println(this.menu2);
            System.out.print("Nhập lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------");

            switch (choice) {
                case 1:
                    QuanLySP quanLySP = new QuanLySP();
                    quanLySP.menu();
                    break;
                case 2:
                    while (true) {
                        System.out.println(this.menu3);
                        System.out.print("Nhập lựa chọn: ");
                        int choice1 = Integer.parseInt(sc.nextLine());
                        System.out.println("------------------------");

                        switch (choice1) {
                            case 1:
                                System.out.println("Tên tài khoản: " + user.getName());
                                System.out.println("Mật khẩu: " + user.getPass());
                                break;
                            case 2:
                                System.out.print("Nhập Mật Khẩu mới: ");
                                String pass = sc.nextLine();
                                user.setPass(pass);
                                System.out.println("Đã sửa xong.");
                                break;
                            case 0:
                                manage();
                                break;
                            default:
                                System.out.println("Xin lựa chọn từ 0 => 2");
                        }
                    }
                case 0:
                    menu();
                    break;
                default:
                    System.out.println("Xin lựa chọn từ 0 => 2");
            }
        }
    }
}
