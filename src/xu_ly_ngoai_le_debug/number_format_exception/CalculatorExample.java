package xu_ly_ngoai_le_debug.number_format_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorExample {
    public static void calculator(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (ArithmeticException e){
            System.out.println("Xảy ra ngoại lệ " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhập x: ");
            int x = sc.nextInt();
            System.out.print("Nhập y: ");
            int y = sc.nextInt();
            calculator(x, y);
        } catch (Exception e){
            System.out.println("Nhập vào chữ rồi") ;
        }


    }

}
