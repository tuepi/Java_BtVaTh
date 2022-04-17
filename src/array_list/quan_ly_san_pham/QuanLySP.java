package array_list.quan_ly_san_pham;

import java.util.*;

public class QuanLySP {
    private ArrayList<SanPham> sanPhams = new ArrayList<>();

    public QuanLySP(ArrayList<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }

    public QuanLySP() {
    }

    //setter & getter
    public ArrayList<SanPham> getSanPhams() {
        return sanPhams;
    }

    public void setSanPhams(ArrayList<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }

    Scanner sc = new Scanner(System.in);

    public void menu() {
        do {
            System.out.println("1. Thêm Sản Phẩm.");
            System.out.println("2. Hiển thị Danh Sách.");
            System.out.println("3. Tìm Kiếm theo Tên.");
            System.out.println("4. Hiển thị Sản Phẩm theo khoảng Giá.");
            System.out.println("5. Sửa Sản Phẩm.");
            System.out.println("6. Xóa Sản Phẩm.");
            System.out.println("7. Sắp Xếp Sản Phẩm theo Giá.");
            System.out.println("0. Thoát.");
            System.out.print("Nhập lựa chọn: ");
            int luaChon = Integer.parseInt(sc.nextLine());

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
                    System.out.println("Danh Sách sau khi sắp xếp: ");
                    display();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Xin lựa chọn từ 0 >>> 8");
            }
        }
        while (check());

    }

    public boolean check() {
        System.out.print("Bạn có muốn tiếp tục? (Y / N): ");
        String ck = sc.nextLine().toLowerCase(Locale.ROOT);
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

        SanPham sanPham = new SanPham(nhanHieu, ten, id, gia);
        return sanPham;
    }

    public void them() {
       do {
            SanPham sp = nhapSP();
            int viTri = timKiemViTriTheoTen(sp.getTen());
            if (viTri != -1) {
                System.out.println("Đã tồn tại Sản Phẩm (cùng tên).\nNhập lại>>>");
                them();
            } else {
                sanPhams.add(sp);
                System.out.print("Đã thêm vào danh sách ");
                System.out.println("Sản Phẩm thứ " + (sanPhams.size()) + " {" + sp + "}");
                System.out.print("Tiếp tục thêm Sản Phẩm ? (Y / N) : ");
                tiepTuc();
            }
        }
       while (tiepTuc());
    }

    public boolean tiepTuc() {
//        System.out.print("Có tiếp tục thêm Sản Phẩm hay không? (Y / N): ");
        String traLoi = sc.nextLine().toLowerCase(Locale.ROOT);
        if (traLoi.equals("y")) {
            them();
            return true;
        } else if (traLoi.equals("n")) {
            menu();
            return false;
        } else {
            System.out.print("Nhập lại lựa chọn (Y / N) >>>");
            tiepTuc();
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
        int viTri = timKiemViTriTheoTen(tenTK);
        if (viTri != -1) {
            System.out.println("Vị trí " + (viTri + 1) + ": {" + sanPhams.get(viTri) + "}");
        } else {
            System.out.println("Không có tên Sản Phẩm " + tenTK + " trong Danh Sách.");
            //Yêu cầu nhập lại hoặc thoát ra menu
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
            System.out.println("Không tồn tại Sản Phẩm nằm trong khoảng giá đó.");
            //yêu cầu nhập lại
        }
    }

    public void sua() {
        System.out.print("Nhập tên Sản Phẩm cần sửa: ");
        String ten = sc.nextLine();
        //Hỏi người dùng muốn sửa thông tin gì???
        //Tạo menu gồm: Tên, Nhãn Hàng, ID, Giá thành và Tất cả
        int viTriSua = timKiemViTriTheoTen(ten);
        if (viTriSua != -1) {
            System.out.println("Sẽ sửa Sản Phẩm: {" + sanPhams.get(viTriSua) + "}");
            while (true) {
                System.out.println("Bạn cần sửa thông tin nào?");
                System.out.println("1. Tên Sản Phẩm.");
                System.out.println("2. ID.");
                System.out.println("3. Nhãn Hiệu.");
                System.out.println("4. Giá Sản Phẩm.");
                System.out.println("5. Tất cả.");
                System.out.println("0. Thoát ra Menu.");
                System.out.print("Nhập lựa chọn>>>");
                int luaChon = Integer.parseInt(sc.nextLine());
                System.out.print("Sửa lại: ");

                switch (luaChon) {
                    case 1:
                        sanPhams.get(viTriSua).setTen(sc.nextLine());
                        System.out.println("Đã Sửa Tên.");
                        break;
                    case 2:
                        sanPhams.get(viTriSua).setId(Integer.parseInt(sc.nextLine()));
                        System.out.println("Đã Sửa ID.");
                        break;
                    case 3:
                        sanPhams.get(viTriSua).setNhanHieu(sc.nextLine());
                        System.out.println("Đã Sửa Nhãn Hiệu.");
                        break;
                    case 4:
                        sanPhams.get(viTriSua).setGia(Integer.parseInt(sc.nextLine()));
                        System.out.println("Đã Sửa Giá.");
                        break;
                    case 5:
                        SanPham sp = nhapSP();
                        System.out.println("Đã sửa Sản Phẩm yêu cầu thành: " + sp);
                        sanPhams.set(viTriSua, sp);
                        break;
                    case 0 :
                        menu();
                        break;
                    default:
                        System.out.print("Nhập lại Lựa chọn 0 => 5 : ");
                }
            }
        } else {
            System.out.println("Không có tên Sản Phẩm " + ten + " trong danh sách.");
            //Yêu cầu nhập lại hoặc thoát ra Menu chủ

        }
    }

    public void xoa() {
        System.out.print("Nhập tên Sản Phẩm cần xóa: ");
        String tenXoa = sc.nextLine();
        int viTri = timKiemViTriTheoTen(tenXoa);
        if (viTri != -1) {
            System.out.println("Đã xóa Sản Phẩm: {" + sanPhams.get(viTri) + "}");
            ;
            sanPhams.remove(viTri);

        } else {
            System.out.println("Không có Sản Phẩm " + tenXoa + " trong Danh Sách.");
            //Yêu cầu nhập lại hoặc thoát ra Menu chủ
        }
    }

    public void sapXepGia() {
        Collections.sort(this.sanPhams);
    }

    public void display() {
        System.out.println("Danh Sách Sản Phẩm: ");
        for (int i = 0; i < sanPhams.size(); i++) {
            System.out.println("Sản phẩm " + (i + 1) + ": {" + sanPhams.get(i) + "}");
        }
    }
}
