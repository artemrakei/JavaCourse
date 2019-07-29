package FirstStep;

import java.util.Scanner;

public class TenthExercise {


    public static void main(String[] args) {
        int a, b, x, y, z;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A:");
        a = in.nextInt();
        System.out.println("Enter B:");
        b = in.nextInt();
        System.out.println("Enter x:");
        x = in.nextInt();
        System.out.println("Enter y:");
        y = in.nextInt();
        System.out.println("Enter z:");
        z = in.nextInt();
        if ((a > x && (b > y || b > z)) || (a > y && (b > x || b > z)) || (a > z && (b > y || b > x))) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }
    }

}
