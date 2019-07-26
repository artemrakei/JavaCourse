import java.util.Scanner;

public class SeventhExercise {
    public static void main(String[] args) {
        double first, second;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        first = in.nextDouble();
        System.out.println("Enter y:");
        second = in.nextDouble();
        if (first + second >= 180) {
            System.out.println("does not exist");
        } else if (first + second == 90) {
            System.out.println("right triangle");
        } else {
            System.out.println("exist");
        }

    }
}
