package FirstStep;

import java.util.Scanner;

public class SixthExercise {
    public static void main(String[] args) {
        double x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        x = in.nextDouble();
        System.out.println("Enter y:");
        y = in.nextDouble();
        if ((x >= -2 && x <= 2 && y >= -3 && y <= 4) || (x >= -4 && x < -2 && y <= 0 && y >= -3) || (x > 2 && x <= 4 && y <= 0 && y >= -3)) {
            System.out.println("In");
        } else {
            System.out.println("Out");
        }

    }
}
