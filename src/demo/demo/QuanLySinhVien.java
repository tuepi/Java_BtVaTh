package demo.demo;

public class QuanLySinhVien {
    private SinhVien[] mangSinhVien;

    public QuanLySinhVien() {
    }

    public QuanLySinhVien(SinhVien[] mangSinhVien) {
        this.mangSinhVien = mangSinhVien;
    }

    public SinhVien[] getMangSinhVien() {
        return mangSinhVien;
    }

    public void setMangSinhVien(SinhVien[] mangSinhVien) {
        this.mangSinhVien = mangSinhVien;
    }

    public void them(SinhVien sinhVien) {

    }

    public void sua(SinhVien sinhVien, int viTri) {

    }

    public void xoa(int viTri) {

    }

    public SinhVien timKiem(String ten) {
        return new SinhVien();
    }
}
