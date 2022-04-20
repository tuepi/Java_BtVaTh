package array_list.manage_family;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Town {
    private List<Family> familyList = new ArrayList<>();
    private int familyNumber;
    Scanner sc = new Scanner(System.in);

    public Town() {
    }

    public int getFamilyNumber() {
        return familyNumber;
    }

    public void setFamilyNumber(int familyNumber) {
        this.familyNumber = familyNumber;
    }

    public void menuManage(){
        String menu1 = """
            ====================MENU====================
            1.            THÊM HỘ GIA ĐÌNH              |
            2.          HIỂN THỊ HỘ GIA ĐÌNH            |
            2.           QUẢN LÝ THÀNH VIÊN             |
            0.               >>>THOÁT<<<                |
            --------------------------------------------
            """;
        String menu2 = """
            ====================MENU====================
            1.            THÊM HỘ GIA ĐÌNH              |
            2.          HIỂN THỊ HỘ GIA ĐÌNH            |
            2.           QUẢN LÝ THÀNH VIÊN             |
            0.               >>>THOÁT<<<                |
            --------------------------------------------
            """;
        String menu3 = """
            ====================MENU====================
            1.            THÊM HỘ GIA ĐÌNH              |
            2.          HIỂN THỊ HỘ GIA ĐÌNH            |
            2.           QUẢN LÝ THÀNH VIÊN             |
            0.               >>>THOÁT<<<                |
            --------------------------------------------
            """;
        do {
            System.out.println(menu1);
            System.out.print("Nhập lựa chọn >>> ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    addFamily();
                    break;
                case 2 :
                    display();
                    break;
                case 3 :

            }
        } while (true);
    }

    public Family creatFamily(){
        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();

        return new Family(address);
    }

    public void addFamily(){
        System.out.println("THÊM HỘ GIA ĐÌNH: " + (familyNumber + 1));
        Family family = creatFamily();

        family.addPerson();
        familyList.add(family);
        familyNumber++;
    }

    public boolean next() {
        String answer = sc.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("------------------------");
        if (answer.equals("y")) {
            addFamily();
            return true;
        } else if (answer.equals("n")) {
            menuManage();
            return false;
        } else {
            System.out.print("Nhập lại lựa chọn (Y / N) >>> ");
            next();
            System.out.println("------------------------");
            return true;
        }
    }




    public void display() {
        System.out.println("HỘ GIA ĐÌNH " + (this.familyNumber + 1));
//        System.out.println("Địa chỉ: " +  + ", Số Thành Viên: " + this.family.getAmountOfPeople());
        for (int i = 0; i < familyList.size(); i++) {
            familyList.get(i).display();
        }
    }

}
