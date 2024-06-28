package Tutorial04;

import java.util.Scanner;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class SortingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myNamesArray = new int[10];
        System.out.println("Please enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            myNamesArray[i] = scanner.nextInt();
        }

        int[] myNamesArray2 = myNamesArray.clone();

        System.out.println("myNamesArray:");
        for (int i = 0; i < myNamesArray.length; i++) {
            int num = myNamesArray[i];
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("myNamesArray2:");
        for (int num : myNamesArray2) {
            System.out.print(num + " ");
        }
    }
}
