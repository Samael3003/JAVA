import java.util.Scanner;

class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    // No additional code required in this class
}

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        input.close();

        Adder adder = new Adder();

        System.out.println("My superclass is: Arithmetic");
        System.out.println("Sum: " + adder.add(num1, num2));
        System.out.println(num1 + " " + num2 + " " + adder.add(num1, num2));
    }
}
