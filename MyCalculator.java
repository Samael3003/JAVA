import java.util.Scanner;

class MyCalculator {
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero");
        } else {
            return (long) Math.pow(n, p);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyCalculator calculator = new MyCalculator();

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.print("Enter the value of p: ");
        int p = input.nextInt();

        try {
            long result = calculator.power(n, p);
            System.out.println("\nResult: " + result);
        } catch (Exception e) {
            System.out.println("\nError: " + e.getMessage());
        }

        input.close();
    }
}
