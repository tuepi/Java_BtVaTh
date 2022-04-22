package array_list.quan_ly_thi_sinh;

public class ThiSinh {
    private int id;
    private String ten;
    private String diaChi;
    private int mucUuTien;

    public ThiSinh() {
    }

    public ThiSinh(int id, String ten, String diaChi, int mucUuTien) {
        this.id = id;
        this.ten = ten;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(int mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    @Override
    public String toString() {
        return ", id=" + id +
                ", ten='" + ten + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", mucUuTien=" + mucUuTien;
    }
}
