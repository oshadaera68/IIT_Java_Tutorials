package Tutorial04;
import java.util.Scanner;
/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class ShiftElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int lastElement = array[n - 1];

        for (int i = n - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = lastElement;

        System.out.println("Array after shifting:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
