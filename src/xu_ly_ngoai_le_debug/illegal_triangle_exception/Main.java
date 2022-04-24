package xu_ly_ngoai_le_debug.illegal_triangle_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập lần lượt 3 cạnh: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            MyConnection myConnection = new MyConnection(a, b, c);
            myConnection.isTriangle();
        } catch (TriangleException e){
            System.err.println(e.getMessage());
        } catch (InputMismatchException e){
            System.err.println("Không đúng định dạng.");
        }
    }
}
