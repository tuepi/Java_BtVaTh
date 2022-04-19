package demo.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraBieuThuc {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập biểu thức cần xét: ");
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '('){
                    stack.push(arr[i]);
            }else if(arr[i] == ')'){
                if (!stack.isEmpty()){
                    stack.pop();
                } else {
                    System.out.println("BIỂU THỨC SAI.");
                    break;
                }
            }
            if (i == arr.length-1){
                if (!stack.isEmpty()){
                    System.out.println("BIỂU THỨC SAI.");
                } else {
                    System.out.println("BIỂU THỨC ĐÚNG.");
                }
            }
        }
    }
}
