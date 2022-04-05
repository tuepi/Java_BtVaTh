package lesson1;

import java.util.Scanner;

public class Bai6_PTB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b;
        System.out.println("Nhập vào a:");
        a = scanner.nextDouble();
        System.out.println("Nhập vào b:");
        b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có Vô số nghiệm.");
            } else {
                System.out.println("Phương trình Vô nghiệm.");
            }
        } else {
            System.out.println("Phương trình có nghiệm x = " + (-b/a));
        }
    }
}
