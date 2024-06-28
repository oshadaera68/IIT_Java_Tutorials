package Tutorial04;

import java.util.Arrays;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class RemoveBadPairs {
    public static void main(String[] args) {
        int[] list = {3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1};
        int length = list.length;

        if (length % 2 != 0) {
            length--;
        }

        int index = 0;

        for (int i = 0; i < length; i += 2) {
            if (list[i] <= list[i + 1]) {
                list[index++] = list[i];
                list[index++] = list[i + 1];
            }
        }

        int[] resultArray = Arrays.copyOf(list, index);

        System.out.println("Array after removing bad pairs:");
        System.out.println(Arrays.toString(resultArray));
    }
}
