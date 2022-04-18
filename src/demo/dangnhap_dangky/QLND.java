package demo.dangnhap_dangky;

import array_list.quan_ly_san_pham.QuanLySP;
import array_list.quan_ly_san_pham.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLND {

    String menu = """
            ==================MENU===================
            1.              ĐĂNG NHẬP                | 
            2.              ĐĂNG KÝ                  |
            0.              THOÁT                    |
            -----------------------------------------
            Nhập lựa chọn >>>                        |

            """;

    ArrayList<ND> ndList = new ArrayList<>();
    ND user;

    public QLND() {
    }


    Scanner sc = new Scanner(System.in);


    public void menu() {

        while (true) {
            String menu1 = this.menu;
            System.out.println(menu1);

            int luaChon = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------");

            switch (luaChon) {
                case 1:
                    dangNhap();
                    break;
                case 2:
                    System.out.println("Mời Bạn Đăng Ký >>>");
                    dangKy();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Xin lựa chọn từ 0 >>> 2");
            }
        }
    }

    public void ql() {
        while (true) {
            System.out.println("====Quản Lý====");
            System.out.println("1. Đến trang quản lý SP");
            System.out.println("2. Xem Thông Tin tk");
            System.out.println("0. Thoát.");
            System.out.println("------------------------");
            System.out.print("Nhập lựa chọn: ");
            int luaChon = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------");

            switch (luaChon) {
                case 1:
                    QuanLySP qlsp = new QuanLySP();
                    qlsp.menu();
                    break;
                case 2:
                    while (true) {
                        System.out.println("====Tài khoản====");
                        System.out.println("1. Hiển thị tài khoản.");
                        System.out.println("2. Chỉnh sửa Mật khẩu");
                        System.out.println("0. Thoát.");
                        System.out.println("------------------------");
                        System.out.print("Nhập lựa chọn: ");
                        int luaChon1 = Integer.parseInt(sc.nextLine());
                        System.out.println("------------------------");

                        switch (luaChon1) {
                            case 1:
                                System.out.println("Tên tài khoản: " + user.getTen());
                                System.out.println("Mật khẩu: " + user.getPass());
                                break;
                            case 2:
                                System.out.print("Nhập Mật Khẩu mới: ");
                                String pass = sc.nextLine();
                                user.setPass(pass);
                                System.out.println("Đã sửa xong.");
                                break;
                            case 0:
                                System.exit(0);
                            default:
                                System.out.println("Xin lựa chọn từ 0 >>> 2");
                        }
                    }

                case 0:
                    System.exit(0);
                default:
                    System.out.println("Xin lựa chọn từ 0 >>> 2");
            }
        }
    }


    public void dangKy() {
        System.out.println("Nhập tên: ");
        String ten = sc.nextLine();
        for (int i = 0; i < ndList.size(); i++) {
            if (ndList.get(i).getTen().equals(ten)) {
                System.out.println("Đã tồn tại\nNhập lại>>");
                dangKy();
                break;
            }
        }
        System.out.println("Nhập pass: ");
        String pass = sc.nextLine();
        String pass1 = null;

        while (pass != pass1) {
            System.out.println("Nhập lại pass: ");
            pass1 = sc.nextLine();
            if (pass1.equals(pass)) {
                System.out.println("Đăng Ký thành công.");
                ND nd = new ND(ten, pass);
                ndList.add(nd);
                break;
            }
        }
    }

    public void dangNhap() {
        System.out.println("Mời bạn đăng nhập>>");
        System.out.println("Nhập tên: ");
        String ten = sc.nextLine();
        System.out.println("Nhập pass: ");
        String pass = sc.nextLine();
        for (int i = 0; i < ndList.size(); i++) {
            if (ndList.get(i).getTen().equals(ten) && ndList.get(i).getPass().equals(pass)) {
                System.out.println("Đăng nhập thành công.");
                user = new ND(ten, pass);
                ql();
                return;
            }
        }
        System.out.println("Không có tài khoản.");
        menu();
    }

    public static void main(String[] args) {
        QLND qlnd = new QLND();
        qlnd.menu();
    }
}
