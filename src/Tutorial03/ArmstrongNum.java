package Tutorial03;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class ArmstrongNum {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 500
        for (int number = 1; number <= 500; number++) {
            int originalNumber = number;
            int remainder;
            int result = 0;

            // Calculate the sum of the cubes of the digits
            while (originalNumber != 0) {
                remainder = originalNumber % 10;
                result += (int) Math.pow(remainder, 3);
                originalNumber /= 10;
            }

            // Check if the result is equal to the number
            if (result == number) {
                System.out.println(number + " is an Armstrong number.");
            }
        }
    }
}
