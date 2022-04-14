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
        quanLyXeMay.inTatCa();
        System.out.println();

        System.out.println(quanLyXeMay.timKiem("Suxibo"));

        System.out.println("Sau khi xóa: ");
        quanLyXeMay.xoa("Wave");
        quanLyXeMay.inTatCa2();
//
//        XeMay xm4 = new XeMay("Cup", "Vàng", "Củ chuối", 1900, 400);
//        quanLyXeMay.sua("Suxibo", xm4);
//        System.out.println("\nSau khi sửa: ");
//        quanLyXeMay.inTatCa();
//
//        quanLyXeMay.sapXep();
//        System.out.println("\nSau khi sắp xếp");
//        quanLyXeMay.inTatCa();
    }
}
