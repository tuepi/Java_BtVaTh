package demo.test_oop;

public class XeMay extends PhuongTien{
    private int dungTich;

    public XeMay() {
    }

    public XeMay(int dungTich) {
        this.dungTich = dungTich;
    }

    public XeMay(String hang, String mau, String ten, int gia, int dungTich) {
        super(hang, mau, ten, gia);
        this.dungTich = dungTich;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "dungTich=" + dungTich +
                '}' + " thuộc lớp " + super.toString();
    }
}

