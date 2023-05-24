// Java Program to Reverse a String. 

import java.util.Scanner;

public class ReverseStringExample {
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        input.close();

        System.out.println("\nOriginal String: " + str);

        String reversedString = reverseString(str);

        System.out.println("Reversed String: " + reversedString);
    }
}
