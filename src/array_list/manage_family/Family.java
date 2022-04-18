package array_list.manage_family;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Family extends Person{
    private String address;
    private int amountOfPeople;
    List<Person> personList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Family() {
    }

    public Family(String name, String job, int age, int id, String address, int amountOfPeople) {
        super(name, job, age, id);
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

    public int findByName(String name){
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void add() {
        Person person = create();
        personList.add(person);
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
            System.out.println(personList.get(i));
        }
    }

    public static void main(String[] args) {
        Family family = new Family();
        family.add();
        family.add();
        family.display();
//        family.edit();
        family.remove();
        family.display();
        System.out.println("1");
    }


}
