import java.util.Scanner;

import static java.lang.Math.*;

public class ThirdExercise {
    public static void main(String[] args) {
        double result, x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("Entry x");
        x = in.nextDouble();
        System.out.println("Entry y");
        y = in.nextDouble();

        result = ((sin(x)+cos(y))/(cos(x)-sin(y)))*(tan(x*y));
        System.out.println(result);

    }
}
