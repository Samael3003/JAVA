import java.util.Scanner;

// Abstract base class for all vehicles
abstract class Vehicle {
    abstract void move();
}

// Helicopter class
class Helicopter extends Vehicle {
    @Override
    void move() {
        System.out.println("The helicopter flies in the air.");
    }
}

// Car class
class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("The car drives on the road.");
    }
}

// Train class
class Train extends Vehicle {
    @Override
    void move() {
        System.out.println("The train runs on the track.");
    }
}

public class VehicleOrderSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to the Vehicle Order System!");
        System.out.println("Please select the type of vehicle you want to order:");
        System.out.println("1. Helicopter");
        System.out.println("2. Car");
        System.out.println("3. Train");
        System.out.print("Enter your choice (1-3): ");
        
        int choice = input.nextInt();
        
        Vehicle vehicle = null;
        
        switch (choice) {
            case 1:
                vehicle = new Helicopter();
                break;
            case 2:
                vehicle = new Car();
                break;
            case 3:
                vehicle = new Train();
                break;
            default:
                System.out.println("Invalid choice. Exiting program.");
                System.exit(0);
        }
        
        System.out.println("\nOrder details:");
        System.out.println("Vehicle Type: " + vehicle.getClass().getSimpleName());
        System.out.println("Nature of Movement:");
        vehicle.move();
        
        input.close();
    }
}
