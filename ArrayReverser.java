import java.util.Scanner;

public class ArrayReverser {

    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return; // Base case: Array is already reversed or has only one element
        }

        // Swap the first and last elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursively reverse the remaining sub-array
        reverseArray(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        reverseArray(array, 0, n - 1);

        System.out.println("The array in reverse order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

