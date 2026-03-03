import java.util.Stack;

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        if (input == null) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

class TwoPointerStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        if (input == null) return false;
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class UseCasePalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "RaceCar";
        PalindromeStrategy strategy = new TwoPointerStrategy();

        long startTime = System.nanoTime();
        boolean isPalindrome = strategy.check(input);
        long endTime = System.nanoTime();

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + (endTime - startTime) + " ns");
    }
}
