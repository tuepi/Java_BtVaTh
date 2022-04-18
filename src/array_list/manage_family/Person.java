package array_list.manage_family;

import java.util.Scanner;

public class Person {
    private String name, job;
    private int age, id;

    public Person() {
    }

    public Person(String name, String job, int age, int id) {
        this.name = name;
        this.job = job;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    Scanner sc = new Scanner(System.in);

    public Person create(){
        System.out.print("Nhập Tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập Nghề Nghiệp: ");
        String job = sc.nextLine();
        System.out.print("Nhập Tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập CCCD: ");
        int id = Integer.parseInt(sc.nextLine());

        return new Person(name, job, age, id);
    }

    @Override
    public String toString() {
        return "Thành viên : {" +
                "Tên = '" + name + '\'' +
                ", Nghề nghiệp = '" + job + '\'' +
                ", Tuổi = " + age +
                ", ID = " + id +
                '}';
    }
}
