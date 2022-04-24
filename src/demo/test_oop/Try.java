package demo.test_oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        l();
    }

    public static void l() {
        try {
            int[] arr = new int[5];
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vị trí: ");
            int x = sc.nextInt();
            System.out.println("Nhập giá trị: ");
            arr[x] = sc.nextInt();
            System.out.println(arr[x]);
            System.out.println("Kết thúc.");
        } catch (InputMismatchException e) {
            System.err.println("Lỗi nhập.");
            System.out.println("Nhập lại: ");
            l();
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Nhập quá số");
            System.out.println("Nhập lại: ");
            l();
        }

    }
}
