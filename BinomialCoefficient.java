import java.util.Scanner;

public class BinomialCoefficient {

    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1; // Base cases: C(n, 0) = C(n, n) = 1
        } else {
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        int result = binomialCoefficient(n, k);
        System.out.println("C(" + n + ", " + k + ") = " + result);
    }
}
