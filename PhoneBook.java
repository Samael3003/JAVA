import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, String> phoneBook = new HashMap<>();

        System.out.print("Enter the number of entries in the phone book: ");
        int numEntries = input.nextInt();
        input.nextLine();

        System.out.println("Enter the entries in the phone book:");
        for (int i = 0; i < numEntries; i++) {
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Phone Number: ");
            String phoneNumber = input.nextLine();
            phoneBook.put(name, phoneNumber);
        }

        System.out.println("\nEnter the queries (enter 'end' to stop):");
        while (true) {
            System.out.print("Query: ");
            String query = input.nextLine();

            if (query.equals("end")) {
                break;
            }

            if (phoneBook.containsKey(query)) {
                System.out.println("Name: " + query);
                System.out.println("Phone Number: " + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
            System.out.println();
        }

        input.close();
    }
}

