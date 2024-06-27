package Tutorial03;

import java.util.Scanner;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class SecretNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 20) + 1;
        int guess;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            System.out.print("Guess a number between 1 and 20: ");
            guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("You guessed it correctly!");
                guessedCorrectly = true;
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Too high, try again.");
            }
        }
    }
}
