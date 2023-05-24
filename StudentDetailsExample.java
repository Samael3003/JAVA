import java.util.Scanner;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        }
        if (name.matches(".*\\d.*") || !name.matches("^[a-zA-Z\\s]+$")) {
            throw new NameNotValidException("Name should only contain alphabets and spaces.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class StudentDetailsExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the roll number: ");
        int rollNo = input.nextInt();
        input.nextLine(); // Consume the newline character

        System.out.print("Enter the name: ");
        String name = input.nextLine();

        System.out.print("Enter the age: ");
        int age = input.nextInt();
        input.nextLine(); // Consume the newline character

        System.out.print("Enter the course: ");
        String course = input.nextLine();

        try {
            Student student = new Student(rollNo, name, age, course);
            System.out.println("\nStudent Details:");
            student.display();
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }
}
