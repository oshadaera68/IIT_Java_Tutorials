package Tutorial02;

import java.util.Scanner;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class ExamEligibilityCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of classes held: ");
        int held_classes = input.nextInt();

        System.out.print("Enter the number of classes attended: ");
        int attended_classes = input.nextInt();

        int attendance_percentage = (attended_classes/held_classes) * 100;
        System.out.println("Attendance Percentage is: " + attendance_percentage);

        if (attendance_percentage < 75){
            System.out.println("Do You have any medical causes? (Y/N): ");
            char medical_cause = input.next().charAt(0);

            if (medical_cause == 'Y' || medical_cause == 'y'){
                System.out.println("You are allowed to the exam due to medical cause.");
            }else{
                System.out.println("You are not allowed to the exam due to Low attendance.");
            }
        }else{
            System.out.println("You are allowed to the exam.");
        }
    }
}
