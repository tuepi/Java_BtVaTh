package array_list.quan_ly_san_pham;

public class SanPham implements Comparable<SanPham>{
    private String nhanHieu, ten;
    private int id, gia;

    public SanPham() {
    }

    public SanPham(String nhanHieu, String ten, int id, int gia) {
        this.nhanHieu = nhanHieu;
        this.ten = ten;
        this.id = id;
        this.gia = gia;
    }

    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public int compareTo(SanPham o) {
        return this.getGia() - o.getGia();
    }

    @Override
    public String toString() {
        return  "ID: " + id +
                ", Tên SP: " + ten +
                ", Nhãn hiệu: " + nhanHieu +
                ", Giá: " + gia + " USD";
    }


}
