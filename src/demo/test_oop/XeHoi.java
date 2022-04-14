package demo.test_oop;

public class XeHoi extends PhuongTien{
    private int dungTich;

    public XeHoi() {
    }

    public XeHoi(int dungTich) {
        this.dungTich = dungTich;
    }

    public XeHoi(String hang, String mau, String ten, int gia, int dungTich) {
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

