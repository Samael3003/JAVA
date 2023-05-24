import java.util.Scanner;

interface Account {
    void set(String accNo, double balance);
    void display();
}

interface Person {
    void store(String name);
    void disp();
}

class Customer implements Person, Account {
    private String name;
    private String accNo;
    private double balance;
    private double interestRate = 0.05;

    @Override
    public void set(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
        double interest = balance * interestRate;
        System.out.println("Interest: $" + interest);
        System.out.println("Total Amount: $" + (balance + interest));
    }

    @Override
    public void store(String name) {
        this.name = name;
    }

    @Override
    public void disp() {
        System.out.println("Customer Name: " + name);
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = input.nextLine();

        System.out.print("Enter account number: ");
        String accNo = input.nextLine();

        System.out.print("Enter account balance: ");
        double balance = input.nextDouble();

        input.close();

        Customer customer = new Customer();
        customer.store(name);
        customer.set(accNo, balance);

        System.out.println("\nCustomer Information:");
        customer.disp();
        System.out.println();
        System.out.println("Account Details:");
        customer.display();
    }
}
