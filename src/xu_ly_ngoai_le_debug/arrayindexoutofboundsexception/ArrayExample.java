package xu_ly_ngoai_le_debug.arrayindexoutofboundsexception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public int[] creatRandom(){
        Random rd = new Random();
        int[] arr = new int[100];
        System.out.println("Danh sách phần tử của mảng là: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] arr = arrayExample.creatRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập chỉ số của một phần tử bất kỳ: ");
        try {
            int x = sc.nextInt();
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là: " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng.");
        } catch (InputMismatchException e){
            System.err.println("Bạn đã nhập chữ!");
        }
    }
}
