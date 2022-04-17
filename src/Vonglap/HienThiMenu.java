package Vonglap;

import java.util.Locale;
import java.util.Scanner;

public class HienThiMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            while (new HienThiMenu().luaChon()) {
                int choice;
                System.out.println("Menu");
                System.out.println("1. Draw the triangle");
                System.out.println("2. Draw the square");
                System.out.println("3. Draw the rectangle");
                System.out.println("0. Exit");
                System.out.print("Enter your choice >>>");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Draw the square");
                        System.out.println("******");
                        System.out.println("*****");
                        System.out.println("****");
                        System.out.println("***");
                        System.out.println("**");
                        System.out.println("*");
                        break;
                    case 2:
                        System.out.println("Draw the rectangle");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        break;
                    case 3:
                        System.out.println("Draw the rectangle");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("no choice");
                        new HienThiMenu().luaChon();

                }
            }
    }
    public boolean luaChon(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Có tiếp tục? Y(yes) / N(no): ");
        String yn = sc.nextLine().toLowerCase(Locale.ROOT);
        if (yn.equals("y")) {
            return true;
        } else if (yn.equals("n")) {
            System.exit(0);
            return false;
        }
        System.out.println("Nhập lại lựa chọn: ");
        new HienThiMenu().luaChon();
        return true;
    }
}
