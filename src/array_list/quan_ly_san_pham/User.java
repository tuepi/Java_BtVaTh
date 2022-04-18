package array_list.quan_ly_san_pham;

public class User {
    private String name, pass;

    public User() {
    }

    public User(String name, String pass) {
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
        return "Tài Khoản: {" +
                "Tên Đăng Nhập: " + name + '\'' +
                ", Mật khẩu: " + pass + '\'' +
                '}';
    }
}
