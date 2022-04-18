package demo.dangnhap_dangky;

import array_list.quan_ly_san_pham.QuanLySP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLND {
    ArrayList<ND> ndList = new ArrayList<>();

    public QLND() {
    }


    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        QLND qlnd = new QLND();
        qlnd.menu();
    }

    public void menu() {
        while (true) {
            System.out.println("====MENU====");
            System.out.println("1. ĐN");
            System.out.println("2. ĐK");
            System.out.println("0. Thoát.");
            System.out.println("------------------------");
            System.out.print("Nhập lựa chọn: ");
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
                                System.out.println("Tên tài khoản: " ); // hiển thị tài khoản người dùng
                                break;
                            case 2:
                                ;
                                // chỉnh sửa mật khẩu
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

    public int timVT(String ten){
        return -1;
    }

    public void dangNhap() {
        System.out.println("Mời bạn đăng nhập>>");
        System.out.println("Nhập tên: ");
        String ten = sc.nextLine();
        System.out.println("Nhập pass: ");
        String pass = sc.nextLine();
        int dem = 0;
        for (int i = 0; i < ndList.size(); i++) {
            if (ndList.get(i).getTen().equals(ten) && ndList.get(i).getPass().equals(pass)) {
//                ND hienTai = new ND(ten, pass);
                System.out.println("Đăng nhập thành công.");
                dem++;
                ql();
                break;
            }
        }
        if (dem == 0) {
            System.out.println("Không có tài khoản.");
            menu();
        }

    }
}
