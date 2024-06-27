package Tutorial03;

import java.util.Scanner;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class Passcode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctPasscode = 486251;
        int attempts = 0;

        while (attempts < 4) {
            System.out.print("Enter Passcode (6 digits)" + "(attempt -> " + (attempts + 1) + ")" + ": ");
            int inputtedPasscode = input.nextInt();

            if (inputtedPasscode == correctPasscode) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Incorrect. Try again.");
            }
            attempts++;
        }

        if (attempts == 4) {
            System.out.println("Passcode incorrect after 4 attempts. Exiting...");
        }
    }
}
