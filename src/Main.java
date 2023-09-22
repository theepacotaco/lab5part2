import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their birth month
        System.out.print("Enter your birth month (1 - 12): ");
        int birthMonth = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Check if the entered value is in the valid range (1 - 12)
        if (birthMonth >= 1 && birthMonth <= 12) {
            // Output the valid input
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            // Output an error message for invalid input
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}
