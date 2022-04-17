package demo;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chuỗi: ");
        String c = scanner.nextLine();
        System.out.println("nhập số:");
        int d = scanner.nextInt();

    }
}
