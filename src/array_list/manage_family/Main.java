package array_list.manage_family;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Family family1 = new Family();
        Town town = new Town();
//        family1.addPerson();
//        family1.addPerson();
////        family1.edit();
//        family1.display();
//        System.out.println("Nhỏ nhất");
//        family1.displayTheYoungest();
       town.addFamily();
       town.addFamily();
       town.display();

//        Town town = new Town();
//        String menu1 = """
//            ====================MENU====================
//            1.            THÊM HỘ GIA ĐÌNH              |
//            2.          HIỂN THỊ HỘ GIA ĐÌNH            |
//            2.           QUẢN LÝ THÀNH VIÊN             |
//            0.               >>>THOÁT<<<                |
//            --------------------------------------------
//            """;
//        do {
//            System.out.println(menu1);
//            System.out.print("Nhập lựa chọn >>> ");
//            int choice = sc.nextInt();
//            switch (choice) {
//                case 1 :
//                    town.addFamily();
//                    break;
//                case 2 :
//                    town.display();
//                    break;
//                case 3 :
//
//            }
//        } while (true);


    }
}
