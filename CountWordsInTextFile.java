import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountWordsInTextFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path to the text file: ");
        String filePath = scanner.nextLine();
        scanner.close();

        File file = new File(filePath);

        try {
            Scanner fileScanner = new Scanner(file);
            int wordCount = 0;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] words = line.split("\\s+"); // Split line into words using whitespace as delimiter
                wordCount += words.length;
            }

            fileScanner.close();

            System.out.println("\nNumber of words in the text file: " + wordCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }
    }
}
