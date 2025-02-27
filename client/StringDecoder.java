package client;

import java.util.Stack;

public class StringDecoder {

    public static String decodeString(String s) {
        // Stack to store characters and numbers
        Stack<Object> stack = new Stack<>();
        StringBuilder currentString = new StringBuilder();  // Current substring being built
        int currentNum = 0;  // To store the current multiplier number

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // If it's a digit, accumulate the number (could be multi-digit)
                currentNum = currentNum * 10 + (c - '0');
            } else if (c == '[') {
                // Push the current number and current string onto the stack
                stack.push(currentNum);
                stack.push(currentString);
                // Reset for the next segment inside brackets
                currentString = new StringBuilder();
                currentNum = 0;
            } else if (c == ']') {
                // Pop the previous string and the number from the stack
                StringBuilder previousString = (StringBuilder) stack.pop();
                int repeatCount = (int) stack.pop();

                // Repeat the current string and append to the previous string
                for (int i = 0; i < repeatCount; i++) {
                    previousString.append(currentString);
                }

                // Set the current string to the result after repetition
                currentString = previousString;
            } else {
                // If it's a letter, just append to the current string
                currentString.append(c);
            }
        }

        return currentString.toString();
    }

    public static void main(String[] args) {
        String input = "3[a]2[bc]";
        String output = decodeString(input);
        System.out.println(output);  // Output: aaabcbc
    }
}
