package FirstStep;

import java.util.Scanner;

public class TwelfthExercise {
    public static void main(String[] args) {
        int a,sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        a=in.nextInt();
        for (int i=0;i<=a;i++) {
            sum+=i;
        }
        System.out.println("Your sum = "+sum);
    }
}
