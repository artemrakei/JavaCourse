package FirstStep;

import java.util.Scanner;

public class FifthExercise {
    public static void main(String[] args) {
        int a, sec, min, hours;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        a = in.nextInt();
        sec = a % 100;
        min = (a / 100) % 100;
        hours = a / 10000;
        System.out.println(hours + "ч " + min + "мин " + sec + "c");
    }
}
