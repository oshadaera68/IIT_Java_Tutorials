package Tutorial01;

import java.util.Scanner;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String fName = input.next();

        System.out.print("Enter Last Name: ");
        String lName = input.next();

        String fNameIni = fName.substring(0, 1);
        String lNameIni = lName.substring(0, 1);

        System.out.println(fName + " " + lName);
        System.out.println(fNameIni + lNameIni);
    }
}
