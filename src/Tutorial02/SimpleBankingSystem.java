package Tutorial02;

import java.util.Scanner;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class SimpleBankingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the your account balance: ");
        double acc_balance = input.nextDouble();

        boolean con_trans = true;

        while (con_trans) {
            System.out.print("Enter transaction type (deposit, withdrawal, check, exit): ");
            String trans_type = input.next();

            switch (trans_type) {
                case "deposit":
                    System.out.print("Enter the amount of deposit: ");
                    double dep_amount = input.nextDouble();
                    if (dep_amount > 0) {
                        acc_balance += dep_amount;
                        System.out.println("Deposit successfully. Your new balance is: " + acc_balance);
                    } else {
                        System.out.println("Invalid amount. Please try again.");
                    }
                    break;

                case "withdrawal":
                    System.out.print("Enter the amount to withdraw: ");
                    double withdraw_amount = input.nextDouble();
                    if (withdraw_amount > 0) {
                        acc_balance -= withdraw_amount;
                        if (acc_balance < 0) {
                            System.out.println("Overdraft detected. Your account is overdrawn.");
                        }
                        System.out.println("Withdrawal successfully. Your new balance is: " + acc_balance);
                    } else {
                        System.out.println("Invalid amount. Please try again.");
                    }
                    break;

                case "check":
                    // Handle fraud check
                    if (acc_balance < 100) {
                        System.out.println("Warning: Your account balance is below $100.");
                    } else {
                        System.out.println("Your account balance is sufficient.");
                    }
                    break;

                case "exit":
                    // Exit the program
                    con_trans = false;
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    // Handle invalid transaction type
                    System.out.println("Error: Invalid transaction type. Please enter 'deposit', 'withdrawal', 'check', or 'exit'.");
                    break;
            }
        }
    }
}