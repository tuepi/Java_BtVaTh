package vong_lap;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,u;
        System.out.println("Nhập vào Số thứ nhất:");
        a = scanner.nextInt();
        System.out.println("Nhập vào Số thứ hai:");
        b = scanner.nextInt();

        if (a % b == 0) {
            System.out.println(b + " là UCLN.");
        }
    }
}
