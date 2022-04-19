package array_list.manage_family;

import java.util.ArrayList;
import java.util.List;

public class Town {
    ArrayList<Family> familyList = new ArrayList<>();
    // chứa những hộ gia đình. đẩy vào kiểu List<Person>

//    ArrayList<Person> personList = new ArrayList<>();
    //chứa những thành viên trong gia đình
    Family family;

    public Town() {
    }

//    public Family creatFamily(){
//        return
//    }
    public void addFamily(){
        Family family = new Family();
        List<Person> p = family.addPerson();
        familyList.add((Family) p);
    }

    public void edit() {

    }

    public void remove() {

    }

    public void display() {
        for (int i = 0; i < familyList.size(); i++) {
            System.out.println((i + 1) + ". " + familyList.get(i));
        }
    }

}
