//Java Program to Count Number of Duplicate Words in String

import java.util.*;

public class CommonElementsInArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = input.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = input.nextInt();
        }

        // Input for the second array
        System.out.print("\nEnter the size of the second array: ");
        int size2 = input.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = input.nextInt();
        }

        input.close();

        // Find common elements
        List<Integer> commonElements = findCommonElements(array1, array2);

        // Print the common elements
        System.out.println("\nCommon elements between the two arrays:");
        if (commonElements.isEmpty()) {
            System.out.println("No common elements found.");
        } else {
            for (int num : commonElements) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static List<Integer> findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }

        List<Integer> commonElements = new ArrayList<>();
        for (int num : array2) {
            if (set1.contains(num)) {
                commonElements.add(num);
            }
        }

        return commonElements;
    }
}
