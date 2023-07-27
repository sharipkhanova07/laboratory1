import java.util.Scanner;

public class GCDCalculator {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // Base case: GCD(a, 0) = a
        } else {
            return gcd(b, a % b); // Recursive call using the Euclidean algorithm
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer (b): ");
        int b = scanner.nextInt();

        int result = gcd(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + result);
    }
}

