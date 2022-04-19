package demo.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiNhiPhan {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào Số cần chuyển đổi: ");
        int num = sc.nextInt();

        while (num > 0) {
            stack.push(num % 2);
            num /= 2;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
