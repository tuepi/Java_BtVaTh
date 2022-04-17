package test_abstract_interface;

public class ManageStudent implements Manage<Student> {

    Student[] students = new Student[3];
    private int size = 0;

    @Override
    public void add(Student student) {
        students[size] = student;
        size++;
    }

    @Override
    public int search(String name) {
        for (int i = 0; i < size; i++) {
            if (name.equals(students[i].getName())){
                return i + 1;
            }
        }
        return -1;
    }

    @Override
    public void edit(String name, Student student) {
        if (search(name) != -1) {
            students[search(name) - 1] = student;
        }
//        else {
//            System.out.println("Không tìm thấy Sinh viên cần sửa.");
//        }
    }

    @Override
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }
}
