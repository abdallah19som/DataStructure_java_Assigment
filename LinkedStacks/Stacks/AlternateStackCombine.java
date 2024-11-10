package Stacks;

import java.util.Stack;

public class AlternateStackCombine {
    public static void main(String[] args) {
        // Initialize two arrays
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6, 8, 10};

        // Combine arrays alternately into one stack
        Stack<Integer> combinedStack = combineAlternating(array1, array2);

        // Display the combined stack
        System.out.println("Combined Stack: " + combinedStack);
    }

    // Method to combine two arrays into a stack alternately
    public static Stack<Integer> combineAlternating(int[] array1, int[] array2) {
        Stack<Integer> resultStack = new Stack<>();
        int length1 = array1.length;
        int length2 = array2.length;
        int maxLength = Math.max(length1, length2);

        for (int i = 0; i < maxLength; i++) {
            // Add element from array1 if within bounds
            if (i < length1) {
                resultStack.push(array1[i]+array2[i]);
            }

            // Add element from array2 if within bounds
            if (i < length2) {
                resultStack.push(array2[i]);
            }

        }

        return resultStack;
    }
}
