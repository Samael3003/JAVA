import java.util.Scanner;

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    private int subject1, subject2, subject3;

    public A(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public double getPercentage() {
        double totalMarks = subject1 + subject2 + subject3;
        double percentage = (totalMarks / 300) * 100;
        return percentage;
    }
}

class B extends Marks {
    private int subject1, subject2, subject3, subject4;

    public B(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    public double getPercentage() {
        double totalMarks = subject1 + subject2 + subject3 + subject4;
        double percentage = (totalMarks / 400) * 100;
        return percentage;
    }
}

public class MarksExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get marks for student A
        System.out.println("Enter marks for Student A (out of 100)...");
        System.out.print("Subject 1: ");
        int marksA1 = input.nextInt();
        System.out.print("Subject 2: ");
        int marksA2 = input.nextInt();
        System.out.print("Subject 3: ");
        int marksA3 = input.nextInt();
        input.nextLine(); // Consume newline

        // Create object for student A
        A studentA = new A(marksA1, marksA2, marksA3);

        // Get marks for student B
        System.out.println("\nEnter marks for Student B (out of 100)...");
        System.out.print("Subject 1: ");
        int marksB1 = input.nextInt();
        System.out.print("Subject 2: ");
        int marksB2 = input.nextInt();
        System.out.print("Subject 3: ");
        int marksB3 = input.nextInt();
        System.out.print("Subject 4: ");
        int marksB4 = input.nextInt();
        input.close();

        // Create object for student B
        B studentB = new B(marksB1, marksB2, marksB3, marksB4);

        System.out.println("\nPercentage of marks obtained by Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of marks obtained by Student B: " + studentB.getPercentage() + "%");
    }
}
