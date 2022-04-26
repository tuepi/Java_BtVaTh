package mang_va_phuong_thuc;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("\r\nNhập vào số phần tử của mảng  1: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        taoMang(arr1,1);

        System.out.printf("\r\nNhập vào số phần tử của mảng  2: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        taoMang(arr2,2);

        int[] newArr = new int[size1 + size2];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }
        System.out.println("\r\nIn ra mảng đã gộp: ");
        for (int i : newArr) {
            System.out.print(i + "\t");
        }
    }
    public static void taoMang(int[] arr,int soMang){

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập vào phần tử thứ " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("In ra mảng " + soMang + ": ");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }

}
