package Tutorial01;

import java.util.Scanner;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class MeterCentiConverter {
    public static void main(String[] args) {
        Scanner meter_input = new Scanner(System.in);
        System.out.print("Please Enter the meter value: ");
        double meter_value = meter_input.nextDouble();
        double centimeter_value = meter_value * 100;
        System.out.println("Centimeter Value is: " + (int)centimeter_value);

    }
}
