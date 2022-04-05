package NNJava_1;

import java.util.Scanner;

public class GiaiPTBacNhat {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất.");
        System.out.println("Phương trình có dạng 'a * x + b = 0', Nhập vào lần lượt a và b để timg nghiệm x.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào b:");
        double b = scanner.nextDouble();

        if (a != 0) {
            System.out.println("Phương trình có nghiệm x = " + -b/a);
        } else {
            if (b != 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else {
                System.out.println("Phương trình có Vô số nghiệm.");
            }
        }
    }
}
