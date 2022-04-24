package array_list.quan_ly_tai_lieu;

public class Account {
    private String name;
    private String pass;

    public Account() {
    }

    public Account(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Tài Khoản {" +
                "Tên đăng nhập: '" + name + '\'' +
                ", Mật khẩu: '" + pass + '\'' +
                '}';
    }
}
