package test_abstract_interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManage studentManage = new StudentManage();
        Student student1 = new Student(1, 24, "Kiên", 5);
        Student student2 = new Student(5, 23, "Hưng", 4);
        Student student3 = new Student(2, 28, "Sơn", 7);

        studentManage.add(student1);
        studentManage.add(student2);
        studentManage.add(student3);
        System.out.println("Danh sách Sinh Viên: ");
        studentManage.display();
        System.out.println("-------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Tên Sinh viên cần tìm: ");
        String name = scanner.nextLine();

        if (studentManage.search(name)== -1){
            System.out.println("Không có sinh viên " + name + " trong danh sách.");
        } else {
            System.out.println("Sinh viên cần tìm ở vị trí: " + studentManage.search(name));
        }

        System.out.println("-------------------");
        Student student4 = new Student(5, 27, "Thuận", 2);

        System.out.print("Nhập tên sinh viên cần sửa: ");
        String editName = scanner.nextLine();

        if (studentManage.search(editName) == -1){
            System.out.println("Không có Sinh viên " + editName + " trong danh sách.");
        } else {
            studentManage.edit(editName, student4);
            System.out.println("Danh sách sau khi sửa: ");
            studentManage.display();
        }

    }
}
