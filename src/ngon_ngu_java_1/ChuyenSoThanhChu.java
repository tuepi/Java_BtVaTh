package ngon_ngu_java_1;

import java.util.Scanner;

public class ChuyenSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập số cần đọc: ");
        int so = scanner.nextInt();
        String[] arr = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười"};
        String chuoi = null;
        if (so >= 0 && so <= 10) {
            chuoi = arr[so];
        } else if (so > 10 && so <=19) {
            if (so % 10 != 5) {
                chuoi = "mười " + arr[so % 10];
            } else {
                chuoi = "mười lăm";
            }
        } else if (so >= 20 && so <=99) {
            if (so % 10 == 0) {
                chuoi = arr[so / 10] + "mười";
            } else if (so % 10 == 5) {
                chuoi = arr[so / 10] + " mười lăm";
            } else {
                chuoi = arr[so / 10] + " mươi " + arr[so % 10];
            }
        }
        System.out.println(chuoi);
    }
}
