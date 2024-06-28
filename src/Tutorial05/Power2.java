package Tutorial05;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class Power2 {
    public static void main(String[] args) {
        int number = 5;  // You can change this number to test with other values
        int doubledNumber = power2Number(number);
        System.out.println("The double of " + number + " is " + doubledNumber);
    }

    public static int power2Number(int n) {
        return 2 * n;
    }
}
