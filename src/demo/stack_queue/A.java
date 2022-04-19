package demo.stack_queue;

import java.util.Stack;

public class A {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.add("a");
        s.add("b");
        s.add("c");
        System.out.println(s.peek());
        System.out.println(s.peek());
        System.out.println(s.peek());
//        System.out.println(s.pop());
    }


}
