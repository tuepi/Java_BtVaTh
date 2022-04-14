package quan_ly_xe;

public class XeMay extends PhuongTien implements Comparable<XeMay>{
    private int dungTich;

    public XeMay(){
    }

    public XeMay(int dungTich) {
        this.dungTich = dungTich;
    }

    public XeMay(String hang, String mau, String ten, int gia, int dungTich) {
        super(hang, mau, ten, gia);
        this.dungTich = dungTich;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    @Override
    public int compareTo(XeMay o) {
        return this.getGia() - o.getGia();
    }

    @Override
    public String toString() {
        return "Xe Máy {Hãng: " + getHang()
                + ", Màu: " + getMau()
                + ", Tên: " + getTen()
                + ", Giá: " + getGia()
                + ", Dung Tích: " + dungTich +
                '}' ;
    }
}
