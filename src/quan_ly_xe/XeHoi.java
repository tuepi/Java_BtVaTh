package quan_ly_xe;

public class XeHoi extends PhuongTien implements Comparable<XeHoi>{
    private int soCho;

    public XeHoi(){
    }

    public XeHoi(int soCho) {
        this.soCho = soCho;
    }

    public XeHoi(String hang, String mau, String ten, int gia, int soCho) {
        super(hang, mau, ten, gia);
        this.soCho = soCho;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    @Override
    public int compareTo(XeHoi o) {
        return this.getGia() - o.getGia();
    }
}
