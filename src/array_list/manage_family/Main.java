package array_list.manage_family;

public class Main {
    public static void main(String[] args) {
        Family family = new Family();
//        family.addPerson();
//        family.addPerson();
//        family.display();
////        family.edit();
//        family.remove();
//        family.display();
//        System.out.println("1");
        Town town = new Town();
        town.addFamily();
        town.display();
    }
}
