package lesson1;

import java.util.Scanner;

public class Bai7_SoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào Tháng: ");
        int month = scanner.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Tháng có 31 ngày.");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Tháng có 30 ngày.");
        } else if (month == 2) {
            System.out.println("Tháng có 28 ngày.");
        } else {
            System.out.println("Không có tháng này!!!");
        }
    }
}
