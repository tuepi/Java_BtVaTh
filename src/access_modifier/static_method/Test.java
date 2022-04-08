package access_modifier.static_method;

public class Test {
    public static void main(String[] args) {
        Student.change();

        Student student1 = new Student();
        Student student2 = new Student(2,"Trần");
        Student student3 = new Student(3,"Lê");
        student1.setId(1);
        student1.setName("Nguyễnn");
        student1.display();

        student2.change2(2);
        student2.display();
        Student.change();
        System.out.println(student3);
        student2.setId(4);
        student2.display();

    }
}
