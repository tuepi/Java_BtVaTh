package demo.demo;

public class SinhVien {
    private int ma, tuoi;
    private String ten;

    public SinhVien() {
    }

    public SinhVien(int ma, int tuoi, String ten) {
        this.ma = ma;
        this.tuoi = tuoi;
        this.ten = ten;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}