import java.util.*;

public class LongestConsecutiveSequence {
    public static int findLongestConsecutiveSequence(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int longestSequence = 0;

        for (int num : arr) {
            // Check if the current number is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentSequence = 1;

                // Find the length of the consecutive sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentSequence++;
                }

                longestSequence = Math.max(longestSequence, currentSequence);
            }
        }

        return longestSequence;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        input.close();

        System.out.println("\nArray: " + Arrays.toString(arr));

        int longestSequence = findLongestConsecutiveSequence(arr);

        System.out.println("The longest consecutive elements sequence is " + longestSequence);
    }
}
