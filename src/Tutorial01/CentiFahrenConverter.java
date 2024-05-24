package Tutorial01;

import java.util.Scanner;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class CentiFahrenConverter {
    public static void main(String[] args) {
        Scanner centi_temp_input = new Scanner(System.in);
        System.out.print("Enter the centigrade temperature: ");
        double centi_temp = centi_temp_input.nextDouble();
        double fahrenheit_temp = (9.0 / 5) * centi_temp + 32;
        System.out.println("Fahrenheit Temperature is: " + fahrenheit_temp);
    }
}
