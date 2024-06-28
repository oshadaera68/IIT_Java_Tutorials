package Tutorial04;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class PassByValueVSPassByRefExample {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] referenceArray;
        referenceArray = originalArray;

        // Printing the original array
        System.out.println("Original array:");
        printArray(originalArray);

        // Modifying the referenceArray
        for (int i = 0; i < referenceArray.length; i++) {
            referenceArray[i] *= 2; // Double each element
        }

        // Printing both arrays to observe changes
        System.out.println("Original array after modification:");
        printArray(originalArray);

        System.out.println("Reference array after modification:");
        printArray(referenceArray);
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
