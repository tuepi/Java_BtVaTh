package array_list.manage_family;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Family{
    private String address;
    private int amountOfPeople;
    List<Person> personList = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public Family() {
    }

    public Family(String address, int amountOfPeople) {
        this.address = address;
        this.amountOfPeople = amountOfPeople;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(int amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }

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

    public int findByName(String name){
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public static int numberOfPerson = 1;
    public List<Person> addPerson() {
        personList = new ArrayList<>();
        System.out.println("Nhập thành viên thứ " + numberOfPerson);
        Person person = create();
        personList.add(person);
        numberOfPerson++;
        return personList;
    }

    public void remove() {
        System.out.print("Nhập tên Thành Viên cần xóa: ");
        int index = findByName(sc.nextLine());
        personList.remove(index);
        System.out.println("đã xóa");
    }

    public void edit() {
        System.out.print("Nhập tên Thành Viên cần sửa: ");
        int index = findByName(sc.nextLine());
        personList.set(index, create());
    }

    public void display() {
        for (int i = 0; i < personList.size(); i++) {
            System.out.println((i + 1) + ". " + personList.get(i));
        }
    }


}
