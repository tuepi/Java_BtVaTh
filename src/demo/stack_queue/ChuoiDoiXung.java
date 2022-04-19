package demo.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class ChuoiDoiXung {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần xét: ");
        String inp = sc.nextLine();

        for(int i=0; i<inp.length(); i++){
            stack.push(inp.charAt(i));
        }
        String chuoiDaoNguoc = "";
        while (!stack.isEmpty()){
            chuoiDaoNguoc = chuoiDaoNguoc + String.valueOf(stack.pop());
        }

        if(inp.equals(chuoiDaoNguoc))
            System.out.println("Đối xứng");
        else
            System.out.println("Không đối xứng");


        String string = sc.nextLine();
//      char[] arr = inp.toCharArray();

        for (int i = 0; i < string.length() / 2; i++) {
           // stack.push(inp.charAt(i));
            if (string.charAt(i) != inp.charAt(string.length() - 1) - i) {
                System.out.println("Không đối xứng.");
             return ;
            }
        }
            System.out.println("Đối xứng.");
    }
}
