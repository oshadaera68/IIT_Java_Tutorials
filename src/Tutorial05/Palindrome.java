package Tutorial05;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class Palindrome {
    public static void main(String[] args) {
        // Test cases
        int number1 = 121;
        int number2 = 123454321;
        int number3 = 12345;

        // Test the isPalindrome method
        System.out.println(number1 + " is palindrome: " + isPalindrome(number1));
        System.out.println(number2 + " is palindrome: " + isPalindrome(number2));
        System.out.println(number3 + " is palindrome: " + isPalindrome(number3));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input must be a nonnegative integer.");
        }

        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Check if originalNumber is equal to reversedNumber
        return originalNumber == reversedNumber;
    }
}
