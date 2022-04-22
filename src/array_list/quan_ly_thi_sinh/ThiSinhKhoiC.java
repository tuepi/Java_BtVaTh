package array_list.quan_ly_thi_sinh;

public class ThiSinhKhoiC extends ThiSinh{
    private static final String VAN = "Môn Văn";
    private static final String SU = "Môn Sử";
    private static final String DIA = "Môn Địa";

    public ThiSinhKhoiC() {
    }

    public ThiSinhKhoiC(int id, String ten, String diaChi, int mucUuTien) {
        super(id, ten, diaChi, mucUuTien);
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiC{"+ super.toString() + "}";
    }
}
