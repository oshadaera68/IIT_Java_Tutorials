package Tutorial05;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class DoubleRecursion {
    public static void main(String[] args) {
        int n = 4;
        int result = t(n);
        System.out.println("t(" + n + ") = " + result);
    }

    public static int t(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 3;
        } else {
            return t(n - 2) + t(n - 1);
        }
    }
}
