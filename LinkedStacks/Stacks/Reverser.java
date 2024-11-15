package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Reverser {

    String reverser(String text) {
        Stack<Character> s1 = new Stack<Character>();
        for (int i = 0; i < text.length(); i++)
            s1.push(text.charAt(i));

            String result = "";
            while (!s1.isEmpty())
                result += s1.pop();
            return result;

        }

    StringBuffer reverseBuffer(String text ){
        Stack<Character> s1= new Stack<Character>();
        for (char letter : text.toCharArray())
            s1.push(letter);

        StringBuffer result = new StringBuffer();
        while (!s1.isEmpty())
            result.append(s1.pop());

        return result;
    }

    public static void main(String[] args) {
        long startime,endTime;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to reverse : ");
        String text = scanner.nextLine();
        Reverser test = new Reverser();

        startime = System.nanoTime();
        System.out.println(test.reverseBuffer(text));
        endTime =System.nanoTime();
        System.out.println("time taken with StringBuffer : "+(endTime-startime)+" ns");

        startime = System.nanoTime();
        System.out.println(test.reverser(text));
        endTime =System.nanoTime();
        System.out.println("time taken with String : "+(endTime-startime)+" ns");
    }


}



