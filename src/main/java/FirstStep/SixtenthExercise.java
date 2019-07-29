package FirstStep;

import java.util.Scanner;

import static java.lang.Math.*;

public class SixtenthExercise {
    public static void main(String[] args) {
        int e, n=1;
        double a, result=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter e:");
        e = in.nextInt();
        a=1/2+1/3;
        do  {
            n++;
            a=1/(pow(2,n))+1/(pow(3,n));
            result=result+a;
        } while (e<=abs(a));
        System.out.println(result);
    }
}
