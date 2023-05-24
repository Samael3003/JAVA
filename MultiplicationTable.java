import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();
        input.close();

        System.out.println("Multiplication Table for " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.printf("%d x %d = %d%n", number, i, result);
        }
    }
}
