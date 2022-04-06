package lesson1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diem = 0;
        while (diem != -1) {

        System.out.println("Nhập vào điểm: ");
        diem = scanner.nextInt();

            if (diem > 0 && diem < 5) {
                System.out.println("Yếu");

            } else if (diem >= 5 && diem <= 8) {
                System.out.println("Khá");

            } else if (diem > 8 && diem <= 10) {
                System.out.println("Giỏi");
            } else {
                System.out.println("Nhập lại");
            }
//            diem = 0;
        }

    }


}
