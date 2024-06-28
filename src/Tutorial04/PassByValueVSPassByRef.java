package Tutorial04;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class PassByValueVSPassByRef {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 7, 6, 9, 2, 4};
        int n = array.length;

        // Temporary array to store the valid pairs
        int[] temp = new int[n];
        int index = 0;

        // Process the array to remove bad pairs
        for (int i = 0; i < n - 1; i += 2) {
            if (array[i] <= array[i + 1]) {
                temp[index++] = array[i];
                temp[index++] = array[i + 1];
            }
        }

        // Create the result array with the exact size of valid pairs
        int[] resultArray = new int[index];
        for (int i = 0; i < index; i++) {
            resultArray[i] = temp[i];
        }

        // Print the result array
        System.out.println("Array after removing bad pairs:");
        System.out.println(Arrays.toString(resultArray));
    }
}
