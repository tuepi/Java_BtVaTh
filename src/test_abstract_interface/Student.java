package test_abstract_interface;

public class Student extends Person{
    private int score;

    public Student() {
    }

    public Student(int score) {
        this.score = score;
    }

    public Student(int id, int age, String name, int score) {
        super(id, age, name);
        this.score = score;
    }

    @Override
    public String toString() {
        return "Sinh Viên { ID: " + + getId()
                + ", Tên: " + getName()
                + ", Tuổi: " + getAge()
                + ", Điểm: " + score + " }";
    }
}
