package NNJava_1;

import java.util.Scanner;

public class KiemTraSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean kq = true;
        System.out.println("Nhập số cần xét:");
        int number = scanner.nextInt();
        if (number == 2){
            System.out.println("Là số nguyên tố.");
        } else {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    kq = false;
                    break;
                }
            }
            if (kq == true) {
                System.out.println("Là số nguyên tố.");
            } else {
                System.out.println("Không phải là số nguyên tố.");
            }
        }
    }
}
