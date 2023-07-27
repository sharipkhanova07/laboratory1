import java.util.Scanner;

public class StringDigitChecker {

    public static boolean isAllDigits(String s) {
        if (s == null || s.isEmpty()) {
            return false; // Empty or null strings are not all digits
        }

        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false; // If any character is not a digit, return false
            }
        }

        return true; // If all characters are digits, return true
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isAllDigits(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

