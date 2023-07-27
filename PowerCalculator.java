import java.util.Scanner;

public class PowerCalculator {

    public static int power(int a, int n) {
        if (n == 0) {
            return 1; // Base case: a^0 = 1
        } else {
            return a * power(a, n - 1); // Recursive call to find a^(n-1) and then multiply by a
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();

        int result = power(a, n);
        System.out.println(a + "^" + n + " = " + result);
    }
}

