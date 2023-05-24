import java.util.Arrays;
import java.util.Scanner;

public class SortedString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strings = new String[10];

        // Read 10 strings from the console
        System.out.println("Enter 10 strings:");
        for (int i = 0; i < 10; i++) {
            strings[i] = input.nextLine();
        }
        input.close();

        // Sort the strings
        Arrays.sort(strings);

        System.out.println("\nSorted Strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Combine two strings
        String combined = strings[0] + strings[1];

        System.out.println("\nCombined String:");
        System.out.println(combined);

        // Reverse the first string
        String reversed = reverseString(strings[0]);

        System.out.println("\nReversed String:");
        System.out.println(reversed);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
