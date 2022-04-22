package array_list.quan_ly_thi_sinh;

public class ThiSinhKhoiA extends ThiSinh{
    static final String TOAN = "Môn Toán";
    static final String LY = "Môn Lý";
    static final String HOA = "Môn Hóa";

    public ThiSinhKhoiA() {
    }

    public ThiSinhKhoiA(int id, String ten, String diaChi, int mucUuTien) {
        super(id, ten, diaChi, mucUuTien);
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiA{" + super.toString() + "}";
    }
}
