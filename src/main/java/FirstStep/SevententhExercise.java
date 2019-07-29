package FirstStep;

import java.util.Scanner;

public class SevententhExercise {
    public static void main(String[] args) {
        char symbol;
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter symbol:");
        symbol = in.next().charAt(0);
        number = symbol;
        System.out.println("Number of this number: " + number);
    }
}
