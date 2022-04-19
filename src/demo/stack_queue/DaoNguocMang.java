package demo.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocMang {
    public static void main(String[] args) {
        Queue<Long> integerQueue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số: ");
        Long num = sc.nextLong();
        while (num > 0){
            integerQueue.add(num % 10);
            num /= 10;
        }
        while (!integerQueue.isEmpty()) {
            System.out.print(integerQueue.remove());
        }
        System.out.println();

        Stack<Character> stringStack = new Stack<>();
        System.out.print("Nhập vào chuỗi: ");
        sc.nextLine();
        String string = sc.nextLine();
        char[] arr = string.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            stringStack.push(arr[i]);
        }
        while (!stringStack.isEmpty()) {
            System.out.print(stringStack.pop());
        }

    }
}
