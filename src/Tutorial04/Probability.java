package Tutorial04;

import java.util.Random;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class Probability {
    public static void main(String[] args) {
        Random generator = new Random();

        int simulate = 1000;
        int[] rollsX = new int[simulate];
        int[] rollsY = new int[simulate];

        for (int i = 0; i < simulate; i++) {
            rollsX[i] = generator.nextInt(6) + 1;
            rollsY[i] = generator.nextInt(6) + 1;
        }

        int countX4 = 0;
        int countY4 = 0;
        int countBoth4 = 0;

        for (int i = 0; i < simulate; i++) {
            if (rollsX[i] == 4) countX4++;
            if (rollsY[i] == 4) countY4++;
            if (rollsX[i] == 4 && rollsY[i] == 4) countBoth4++;
        }

        double probabX4 = (double) countX4 / simulate;
        double probabY4 = (double) countY4 / simulate;
        double probabBoth4 = (double) countBoth4 / simulate;

        System.out.println("Estimations for 1,000 simulations:");
        System.out.println("P(X = 4): " + probabX4);
        System.out.println("P(Y = 4): " + probabY4);
        System.out.println("P(X = 4 and Y = 4): " + probabBoth4);

        simulate = 1000000;
        rollsX = new int[simulate];
        rollsY = new int[simulate];

        for (int i = 0; i < simulate; i++) {
            rollsX[i] = generator.nextInt(6) + 1;
            rollsY[i] = generator.nextInt(6) + 1;
        }

        countX4 = 0;
        countY4 = 0;
        countBoth4 = 0;

        for (int i = 0; i < simulate; i++) {
            if (rollsX[i] == 4) countX4++;
            if (rollsY[i] == 4) countY4++;
            if (rollsX[i] == 4 && rollsY[i] == 4) countBoth4++;
        }

        probabX4 = (double) countX4 / simulate;
        probabY4 = (double) countY4 / simulate;
        probabBoth4 = (double) countBoth4 / simulate;

        System.out.println("Estimations for 1,000,000 simulations:");
        System.out.println("P(X = 4): " + probabX4);
        System.out.println("P(Y = 4): " + probabY4);
        System.out.println("P(X = 4 and Y = 4): " + probabBoth4);
    }
}
