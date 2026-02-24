import java.util.Scanner;

public class UseCasePalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Palindrome Checker (UC3: String Reverse) ---");
        System.out.print("Enter a string to check: ");
        String original = scanner.nextLine();

        // 1. Reverse string using a loop
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            // Because Strings are immutable, this creates a new object 
            // in every iteration of the loop.
            reversed = reversed + original.charAt(i);
        }

        // 2. Compare original and reversed using .equals()
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        // 3. Display result
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}