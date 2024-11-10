package Stacks;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();

        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);

        System.out.println("stack elements : \n "+s1);
        System.out.println("removed elements : "+s1.pop());
        System.out.println("stack elements : \n "+s1);
        System.out.println("size : "+s1.size());
        System.out.println("isEmpty : "+s1.isEmpty());
        int top = s1.peek();
        System.out.println("top element :"+ top);



    }
}
