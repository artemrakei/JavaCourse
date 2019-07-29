package FirstStep;

import java.util.Scanner;

public class FirstExercise {


    public static void main(String[] args) {
        int z, a, b, c;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextInt();
        System.out.println("Enter b:");
        b = in.nextInt();
        System.out.println("Enter c:");
        c = in.nextInt();

        z = ((a - 3) * (b / 2)) + c;
        System.out.println("Your result z:" + z);
    }


}
