package lesson1;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Nhập vào a: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào b: ");
        b = scanner.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
