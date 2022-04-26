package mang_va_phuong_thuc;

import java.util.Scanner;

public class TimMaxTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào số lượng phần tử: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập vào phần tử thứ " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("In ra mảng: ");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("\r\n Giá trị lớn nhất trong mảng là : " + max);
    }
}
