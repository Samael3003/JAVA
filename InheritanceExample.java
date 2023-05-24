import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    public void accept() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter age: ");
        age = input.nextInt();
        input.nextLine(); // Consume newline character
    }
}

class Employee extends Person {
    private String designation;
    private double salary;

    public void accept() {
        super.accept();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter designation: ");
        designation = input.nextLine();
        System.out.print("Enter salary: ");
        salary = input.nextDouble();
        input.nextLine(); // Consume newline character
    }

    public boolean hasSalaryGreaterThan(double amount) {
        return salary > amount;
    }

    public String getName() {
        return name;
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        System.out.println("Enter details for 5 persons:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].accept();
        }

        System.out.println("\nEmployees with salary greater than 5000:");
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.hasSalaryGreaterThan(5000)) {
                System.out.println("Name: " + employee.getName());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employee has a salary greater than 5000.");
        }
    }
}

