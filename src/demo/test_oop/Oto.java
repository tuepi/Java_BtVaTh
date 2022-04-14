package demo.test_oop;

public class Oto extends PhuongTien{
    private int soCho;

    public Oto(){
    }

    public Oto(int soCho) {
        this.soCho = soCho;
    }

    public Oto(String hang, String mau, String ten, int gia, int soCho){
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
    public String toString() {
        return "Oto{" +
                "soCho=" + soCho +
                '}' + " thuộc " + super.toString();
    }
}
