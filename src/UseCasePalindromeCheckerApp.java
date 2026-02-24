import java.util.Scanner;

public class UseCasePalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Palindrome Checker ---");
        System.out.print("Enter a string to check: ");
        String original = scanner.nextLine();

        String reversed = "";

        // 1. Reverse string using a loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // 2. Display and Compare result
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        // Using equalsIgnoreCase is safer for palindromes like "Madam"
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Result: The string \"" + original + "\" is a palindrome.");
        } else {
            System.out.println("Result: The string \"" + original + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}