import java.util.*;

public class IterateArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int count = input.nextInt();
        System.out.println("Enter the elements:");

        for (int i = 0; i < count; i++) {
            int num = input.nextInt();
            numbers.add(num);
        }
        input.close();

        System.out.println("\nArrayList Elements:");

        System.out.println("Iterator Loop:");
        iterateUsingIterator(numbers);

        System.out.println("Advanced For Loop:");
        iterateUsingAdvancedForLoop(numbers);

        System.out.println("For Loop:");
        iterateUsingForLoop(numbers);
    }

    public static void iterateUsingIterator(ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    public static void iterateUsingAdvancedForLoop(ArrayList<Integer> list) {
        for (int num : list) {
            System.out.println(num);
        }
        System.out.println();
    }

    public static void iterateUsingForLoop(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}

