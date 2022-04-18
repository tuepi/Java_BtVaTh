package array_list.quan_ly_san_pham;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageUser {
    ArrayList<User> users = new ArrayList<>();

    public ManageUser(ArrayList<User> users) {
        this.users = users;
    }

    public ManageUser() {
    }

    Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("====MENU====");
            System.out.println("1. Đăng Nhập.");
            System.out.println("2. Đăng Ký.");
            System.out.println("0. Thoát.");
            System.out.println("------------------------");
            System.out.print("Nhập lựa chọn >>> ");

            int choice = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------");

            switch (choice) {
                case 1 :
                    login();

                    break;
                case 2 :
                    System.out.println("Mời Bạn Đăng Ký >>>");
                    registration();
                    break;
                case 0 :
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

        int count = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(name) && users.get(i).getPass().equals(pass)) {
                System.out.println(">>>ĐĂNG NHẬP THÀNH CÔNG<<<");
                count++;
                manage();
                break;
            }
        }
        if (count == 0) {
            System.out.println("Tài Khoản Không Tồn Tại!!!");
            menu();
        }
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
            if (pass1.equals(pass)) {
                System.out.println(">>>ĐĂNG KÝ THÀNH CÔNG<<<");
                User user = new User(name, pass);
                users.add(user);
                break;
            }
        }
    }

    public void manage() {
//        while ()
    }
}
