package mangVaPhuongThuc;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập số phần tử trong mảng: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập vào phần tử thứ " +  (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("In ra mảng: ");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println("Mảng sau khi đảo ngược là: ");
        int[] newArr = new int[size];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[arr.length - 1 - i];
        }
        for (int i : newArr) {
            System.out.print(i + "\t");
        }
    }
}
