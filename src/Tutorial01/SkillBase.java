package Tutorial01;

import java.util.Scanner;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class SkillBase {
    public static void main(String[] args) {
        int manual_earn = 500;
        int skilled_earn = 700;
        int management_earn = 800;

        Scanner input = new Scanner(System.in);

        System.out.print("Count of Manual People: ");
        int count_manual = input.nextInt();

        System.out.print("Count of Skilled People: ");
        int count_skilled = input.nextInt();

        System.out.print("Count of Management People: ");
        int count_management = input.nextInt();

        int manual_wages = count_manual * manual_earn;
        int skilled_wages = count_skilled * skilled_earn;
        int management_wages = count_management * management_earn;

        int total_wage_bill = manual_wages + skilled_wages + management_wages;
        System.out.println("Total Wage Bill: " + total_wage_bill);

        double calculate_tax = 0.20 * total_wage_bill;
        System.out.println("Approximate tax is: " + calculate_tax);

    }
}
