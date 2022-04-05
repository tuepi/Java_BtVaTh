package lesson1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a:");
        int a;
        a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
