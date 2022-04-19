package array_list.manage_family;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Family{
    private String address;
    private int amountOfPeople;
    private List<Person> personList = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public Family() {
    }

    public Family(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
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

    public List<Person> addPerson() {
        System.out.println("Nhập thành viên thứ " + (this.amountOfPeople + 1));
        Person person = create();
        personList.add(person);
        this.amountOfPeople++ ;
        return personList;
    }

    public int findIndexById(int id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
    public void findByName(String name){
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName().equals(name)){
                System.out.println(personList.get(i));
            }
        }
    }


    public void remove() {
        System.out.print("Nhập ID Thành Viên cần xóa: ");
        int index = findIndexById(Integer.parseInt(sc.nextLine()));
        if (index != -1){
            personList.remove(index);
            System.out.println("Đã xóa");
            this.amountOfPeople--;
        } else {
            System.out.println("Không tồn tại.");
        }

    }

    public void edit() {
        System.out.print("Nhập ID Thành Viên cần sửa: ");
        int index = findIndexById(Integer.parseInt(sc.nextLine()));
        personList.set(index, create());
    }

    public void display() {
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }
    }

    public void displayTheYoungest(){
        int minAge = personList.get(0).getAge();
        for (int i = 0; i < personList.size(); i++) {
            if (minAge > personList.get(i).getAge()){
                minAge = personList.get(i).getAge();
            }
        }
        for (int i = 0; i < personList.size(); i++) {
            if (minAge == personList.get(i).getAge()){
                System.out.println(personList.get(i));
            }
        }
    }

}
