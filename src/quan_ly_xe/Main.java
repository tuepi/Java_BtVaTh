package quan_ly_xe;

public class Main {
    public static void main(String[] args) {
        QuanLyXeMay quanLyXeMay = new QuanLyXeMay();
        XeMay xm1 = new XeMay("Honda", "Trắng", "Wave", 100, 110);
        XeMay xm2 = new XeMay("Suzuki", "Đen", "Suxibo", 500, 150);
        XeMay xm3 = new XeMay("Yamaha", "Đỏ", "Banana", 900, 220);
        quanLyXeMay.them(xm1);
        quanLyXeMay.them(xm2);
        quanLyXeMay.them(xm3);

        System.out.println("Danh Sách Xe: ");
        quanLyXeMay.inTatCa();
        System.out.println("-----------------------------");

        System.out.print("Vị trí của xe Suxibo trong danh sách: \t");
        System.out.println(quanLyXeMay.timKiem("Suxibo"));

        System.out.println("------------------------------");
        XeMay xm4 = new XeMay("Cup", "Vàng", "Củ chuối", 1900, 400);
        quanLyXeMay.sua("Suxibo", xm4);
        System.out.println("\nDanh sách sau khi sửa: ");
        quanLyXeMay.inTatCa();

        System.out.println("---------------------------------");
        System.out.println("\nDanh sách sắp xếp theo giá tăng dần: ");
        quanLyXeMay.sapXep();
        quanLyXeMay.inTatCa();

        System.out.println("---------------------------------");
        System.out.print("\nXóa xe SH trong danh sách: ");
        quanLyXeMay.xoa("SH");

        System.out.println("---------------------------------");
        System.out.println("\nDanh sách sau khi xóa Wave: ");
        quanLyXeMay.xoa("Wave");
        quanLyXeMay.inSauXoa();
    }
}
