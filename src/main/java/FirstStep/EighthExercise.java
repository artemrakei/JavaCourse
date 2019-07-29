package FirstStep;

import java.util.Scanner;

public class EighthExercise {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextInt();
        System.out.println("Enter b:");
        b = in.nextInt();
        System.out.println("Enter c:");
        c = in.nextInt();
        System.out.println("Enter d:");
        d = in.nextInt();
        if (a > b) {
            a = b;
        }
        if (c > d) {
            c = d;
        }
        if (a < c) {
            a = c;
        }
        System.out.println(a);
    }
}
