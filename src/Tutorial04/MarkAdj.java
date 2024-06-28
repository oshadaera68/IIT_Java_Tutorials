package Tutorial04;

import java.util.Scanner;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class MarkAdj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] marks = new double[10];

        System.out.println("Enter 10 student marks:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            marks[i] = marks[i] * 0.9;
        }

        System.out.println("Reduced marks:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
        }
    }
}
