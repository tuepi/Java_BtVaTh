package mangVaPhuongThuc;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != -1) {
            System.out.printf("Chọn: ");
            choice = scanner.nextInt();
            double c, f;
            switch (choice) {
                case 1:
                    System.out.printf("Nhập vào độ F: ");
                    f = scanner.nextDouble();
                    c = (5.0 / 9) * (f - 32);
                    System.out.println("Độ C là: " + c);
                    break;
                case 2:
                    System.out.printf("Nhập vào độ C: ");
                    c = scanner.nextDouble();
                    f = (9.0 / 5) * (c - 32);
                    System.out.println("Độ F là: " + f);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn lại: ");
                    break;
            }
//            k = 0;
        }
    }
}
