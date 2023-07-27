import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case: F0 = 0
        } else if (n == 1) {
            return 1; // Base case: F1 = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call to find F(n-1) + F(n-2)
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
        } else {
            int result = fibonacci(n);
            System.out.println("The " + n + "-th element in the Fibonacci sequence is: " + result);
        }
    }
}