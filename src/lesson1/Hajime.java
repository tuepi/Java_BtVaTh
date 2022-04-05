package lesson1;

import java.util.Scanner;

public class Hajime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        int a;
        a = scanner.nextInt();
        System.out.println("Nhập vào b: ");
        int b;
        b = scanner.nextInt();
        System.out.println("Tổng 2 số là " + (a + b));
    }
}
