package Tutorial05;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class FindFactorial {
    public static void main(String[] args) {
        int number = 5;  // You can change this number to calculate factorial for a different number
        long factorialResult = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is " + factorialResult);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
