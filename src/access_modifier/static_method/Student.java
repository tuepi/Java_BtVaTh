package access_modifier.static_method;

public class Student {
    private int id;
    private String name;
    private static String college = "NIHONGO";

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Student(){
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    static void change() {
        college = "CODEGYM";
    }
    void change2(int id) {
        college = "EDUMALL";
        this.id = id;
    }
    void display() {
        System.out.println("Học viên: {id = " + id + ", tên = " + name + ", trung tâm học = " + college + "}");
    }

    @Override
    public String toString() {
        return "Học viên: {" +
                "id = " + id +
                ", tên = " + name + ", trung tâm học = " + college + '}';
    }
}
