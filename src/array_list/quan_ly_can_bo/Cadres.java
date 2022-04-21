package array_list.quan_ly_can_bo;

public class Cadres {
    private String name;
    private int age;
    private String gender, address;

    public Cadres() {
    }

    public Cadres(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Họ Tên ='" + name + '\'' +
                ", Tuổi =" + age +
                ", Giới Tính ='" + gender + '\'' +
                ", Địa chỉ ='" + address + '\'' + "";
    }
}
