package array_list.quan_ly_thi_sinh;

public class ThiSinhKhoiB extends ThiSinh{
    private static final String TOAN = "Môn Toán";
    private static final String HOA = "Môn Hoa";
    private static final String SINH = "Môn Sinh";

    public ThiSinhKhoiB() {
    }

    public ThiSinhKhoiB(int id, String ten, String diaChi, int mucUuTien) {
        super(id, ten, diaChi, mucUuTien);
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiB{" + super.toString() + "}";
    }
}
