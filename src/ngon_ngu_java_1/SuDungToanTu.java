package ngon_ngu_java_1;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài:");
        float cd = scanner.nextFloat();
        System.out.println("Nhập chiều rộng:");
        float cr = scanner.nextFloat();
        float dienTich = cd * cr;
        System.out.println("Diện tích hình chữ nhật là: " + dienTich);
    }
}
