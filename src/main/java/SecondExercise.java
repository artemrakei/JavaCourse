import java.util.Scanner;

import static java.lang.Math.sqrt;

public class SecondExercise {


    public static void main(String[] args) {
        double z, a, b, c;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextInt();
        System.out.println("Enter b:");
        b = in.nextInt();
        System.out.println("Enter c:");
        c = in.nextInt();

        z = ((b + (sqrt(b * b + (4 * a * c)))) / (2 * a)) - (((a * a * a) * c) + (1 / (b * b)));
        System.out.println("Your result z:" + z);
    }


}

