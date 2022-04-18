package array_list.quan_ly_san_pham;

import java.util.*;

public class QuanLySP {
    private ArrayList<SanPham> sanPhams = new ArrayList<>();

    public QuanLySP(ArrayList<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }

    public QuanLySP() {
    }

    public ArrayList<SanPham> getSanPhams() {
        return sanPhams;
    }

    public void setSanPhams(ArrayList<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }

    Scanner sc = new Scanner(System.in);

    String menu = """
            ====================MENU====================
            1.              THÊM SẢN PHẨM               | 
            2.            HIỂN THỊ DANH SÁCH            |
            3.            TÌM KIẾM THEO TÊN             |
            4.            TÌM THEO KHOẢNG GIÁ           |
            5.               SỬA SẢN PHẨM               |
            6.               XÓA SẢN PHẨM               |
            7.             SẮP XẾP THEO GIÁ             |
                                                        |
            0.               >>>THOÁT<<<                |
            --------------------------------------------
            """;

    String menuEdit = """
            =============THÔNG TIN CẦN SỬA==============
            1.             TÊN SẢN PHẨM                 | 
            2.             ID SẢN PHẨM                  |
            3.             NHÃN HIỆU                    |
            4.             GIÁ SẢN PHẨM                 |
            5.             TẤT CẢ THÔNG TIN             |
            0.             >>>THOÁT<<<                  |
            --------------------------------------------
            """;

    public void menu() {
        do {
            System.out.println(this.menu);
            System.out.print("Nhập lựa chọn: ");
            int luaChon = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------");

            switch (luaChon) {
                case 1:
                    them();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    timKiemTen();
                    break;
                case 4:
                    timKiemTheoGia();
                    break;
                case 5:
                    sua();
                    break;
                case 6:
                    xoa();
                    break;
                case 7:
                    sapXepGia();
                    System.out.println("Sau khi sắp xếp >>> ");
                    display();
                    break;
                case 0:
                    Main.manageUser.manage();
                    break;
                default:
                    System.out.println("Xin lựa chọn từ 0 >>> 8");
            }
        }
        while (check());

    }

    public boolean check() {
        System.out.print("Bạn có muốn tiếp tục? (Y / N): ");
        String ck = sc.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("------------------------");
        if (ck.equals("y")) {
            return true;
        } else if (ck.equals("n")) {
            System.exit(0);
            return false;
        } else {
            System.out.print("Nhập lại lựa chọn:  ");
            check();
            return true;
        }
    }

    public SanPham nhapSP() {
        System.out.println("-----NHẬP THÔNG TIN SẢN PHẨM MỚI----- ");
        System.out.print("Nhập ID Sản Phẩm: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập Tên Sản Phẩm: ");
        String ten = sc.nextLine();
        System.out.print("Nhập Nhãn Hiệu Sản Phẩm: ");
        String nhanHieu = sc.nextLine();
        System.out.print("Nhập Giá Sản Phẩm: ");
        int gia = Integer.parseInt(sc.nextLine());
        System.out.println("------------------------");

        SanPham sanPham = new SanPham(nhanHieu, ten, id, gia);
        return sanPham;
    }

    public void them() {
       do {
            SanPham sp = nhapSP();
            int viTri = timKiemViTriTheoTen(sp.getTen());
            if (viTri != -1) {
                System.out.println("Đã tồn tại Sản Phẩm (cùng tên).\nNhập lại>>>");
                System.out.println("------------------------");
                them();
            } else {
                sanPhams.add(sp);
                System.out.print("Đã thêm vào danh sách ");
                System.out.println("Sản Phẩm thứ " + (sanPhams.size()) + " {" + sp + "}");
                System.out.println("------------------------");
                System.out.print("Tiếp tục thêm Sản Phẩm ? (Y / N) : ");
                tiepTuc();
                System.out.println("------------------------");
            }
        }
       while (tiepTuc());
    }

    public boolean tiepTuc() {
        String traLoi = sc.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("------------------------");
        if (traLoi.equals("y")) {
            them();
            return true;
        } else if (traLoi.equals("n")) {
            menu();
            return false;
        } else {
            System.out.print("Nhập lại lựa chọn (Y / N) >>> ");
            tiepTuc();
            System.out.println("------------------------");
            return true;
        }
    }

    public int timKiemViTriTheoTen(String ten) {
        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(i).getTen().equals(ten)) {
                return i;
            }
        }
        return -1;
    }

    public void timKiemTen() {
        System.out.print("Nhập tên Sản Phẩm cần tìm kiếm: ");
        String tenTK = sc.nextLine();
        System.out.println("------------------------");
        int viTri = timKiemViTriTheoTen(tenTK);
        if (viTri != -1) {
            System.out.println("Vị trí " + (viTri + 1) + ": {" + sanPhams.get(viTri) + "}");
            System.out.println("------------------------");
        } else {
            System.out.println("Không có tên Sản Phẩm " + tenTK + " trong Danh Sách.\nNhập lại>>>");
            System.out.println("------------------------");
            if (sanPhams.size() > 0){
                timKiemTen();
            }
            System.out.println("Danh sách đang trống!!!");
            menu();
        }
    }

    public void timKiemTheoGia() {
        System.out.print("Tìm Kiếm theo khoảng Giá Từ: ");
        int giaDau = Integer.parseInt(sc.nextLine());
        System.out.print("Đến: ");
        int giaCuoi = Integer.parseInt(sc.nextLine());
        int dem = 0;
        for (int i = 0; i < sanPhams.size(); i++) {
            int giaSP = sanPhams.get(i).getGia();
            if (giaSP >= giaDau && giaSP <= giaCuoi) {
                System.out.println("Sản Phẩm vị trí thứ " + (i + 1) + ": {" + sanPhams.get(i) + "}");
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Không tồn tại Sản Phẩm nằm trong khoảng giá đó.\nNhập lại >>> ");
            System.out.println("------------------------");
            if (sanPhams.size() > 0){
                timKiemTheoGia();
            }
            System.out.println("Danh sách đang trống!!!");
            menu();
        }
        System.out.println("------------------------");
    }

    public void sua() {
        System.out.print("Nhập tên Sản Phẩm cần sửa: ");
        String ten = sc.nextLine();
        int viTriSua = timKiemViTriTheoTen(ten);
        if (viTriSua != -1) {
            System.out.println("Sẽ sửa Sản Phẩm: {" + sanPhams.get(viTriSua) + "}");
            System.out.println("------------------------");
            while (true) {
                System.out.println(this.menuEdit);
                System.out.print("Nhập lựa chọn >>> ");
                int luaChon = Integer.parseInt(sc.nextLine());
                System.out.println("------------------------");

                switch (luaChon) {
                    case 1:
                        System.out.print("Sửa lại thành: ");
                        sanPhams.get(viTriSua).setTen(sc.nextLine());
                        System.out.println("Đã Sửa Tên.");
                        System.out.println("------------------------");
                        check();
                        break;
                    case 2:
                        System.out.print("Sửa lại thành: ");
                        sanPhams.get(viTriSua).setId(Integer.parseInt(sc.nextLine()));
                        System.out.println("Đã Sửa ID.");
                        System.out.println("------------------------");
                        check();
                        break;
                    case 3:
                        System.out.print("Sửa lại thành: ");
                        sanPhams.get(viTriSua).setNhanHieu(sc.nextLine());
                        System.out.println("Đã Sửa Nhãn Hiệu.");
                        System.out.println("------------------------");
                        check();
                        break;
                    case 4:
                        System.out.print("Sửa lại thành: ");
                        sanPhams.get(viTriSua).setGia(Integer.parseInt(sc.nextLine()));
                        System.out.println("Đã Sửa Giá.");
                        System.out.println("------------------------");
                        check();
                        break;
                    case 5:
                        SanPham sp = nhapSP();
                        System.out.println("Đã sửa Sản Phẩm yêu cầu thành: " + sp);
                        sanPhams.set(viTriSua, sp);
                        System.out.println("------------------------");
                        check();
                        break;
                    case 0 :
                        menu();
                        break;
                    default:
                        System.out.print("Nhập lại Lựa chọn 0 => 5 : ");
                }
            }
        } else {
            System.out.println("Không có tên Sản Phẩm " + ten + " trong danh sách.\nNhập lại >>>");
            System.out.println("------------------------");
            if (sanPhams.size() > 0){
                sua();
            }
            System.out.println("Danh sách đang trống!!!");
            menu();
        }
        System.out.println("------------------------");
    }

    public void xoa() {
        System.out.print("Nhập tên Sản Phẩm cần xóa: ");
        String tenXoa = sc.nextLine();
        System.out.println("------------------------");
        int viTri = timKiemViTriTheoTen(tenXoa);
        if (viTri != -1) {
            System.out.println("Đã xóa Sản Phẩm: {" + sanPhams.get(viTri) + "}");
            sanPhams.remove(viTri);
        } else {
            System.out.println("Không có Sản Phẩm " + tenXoa + " trong Danh Sách.\nNhập lại >>>");
            System.out.println("------------------------");
            //Yêu cầu nhập lại hoặc thoát ra Menu chủ
            if (sanPhams.size() > 0){
                xoa();
            }
            System.out.println("Danh sách đang trống!!!");
            menu();
        }
        System.out.println("------------------------");
    }

    public void sapXepGia() {
        Collections.sort(this.sanPhams);
    }

    public void display() {
        if (sanPhams.size() <= 0) {
            System.out.println("Danh sách trống!!!");
            menu();
        }
        System.out.println("Danh Sách Sản Phẩm: ");
        for (int i = 0; i < sanPhams.size(); i++) {
            System.out.println("Sản phẩm " + (i + 1) + ": {" + sanPhams.get(i) + "}");
        }
        System.out.println("------------------------");
    }
}
