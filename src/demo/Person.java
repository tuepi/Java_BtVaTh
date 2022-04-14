package demo;

public abstract class Person {
    private String name;
    private int id;
    public abstract void hienThi();

    public Person() {
    }
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
class Main {
    public static void main(String[] args) {
        // Khai báo nặc danh
        Person a = new Person() {
            @Override
            public void hienThi() {
                System.out.println("h");
            }
        };

    }
}