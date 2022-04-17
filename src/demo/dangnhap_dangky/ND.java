package demo.dangnhap_dangky;

public class ND {
    private String ten,pass;

    public ND() {
    }

    public ND(String ten, String pass) {
        this.ten = ten;
        this.pass = pass;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "ND{" +
                "ten='" + ten + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
