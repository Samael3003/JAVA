import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String name;
    private String grade;
    private List<String> courses;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println("Course removed: " + course);
        } else {
            System.out.println("Course not found: " + course);
        }
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses:");

        if (courses.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            for (String course : courses) {
                System.out.println("- " + course);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student grade: ");
        String grade = input.nextLine();

        Student student = new Student(name, grade);

        System.out.println("\nStudent created successfully!");
        System.out.println("-----------------------------");

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. Display Student Info");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice = input.nextInt();
            input.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("\nEnter the course name: ");
                    String courseName = input.nextLine();
                    student.addCourse(courseName);
                    System.out.println("Course added: " + courseName);
                    break;
                case 2:
                    System.out.print("\nEnter the course name to remove: ");
                    String courseToRemove = input.nextLine();
                    student.removeCourse(courseToRemove);
                    break;
                case 3:
                    System.out.println("\nStudent Information:");
                    System.out.println("--------------------");
                    student.displayStudentInfo();
                    break;
                case 4:
                    System.out.println("\nGoodbye!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        }

        input.close();
    }
}

