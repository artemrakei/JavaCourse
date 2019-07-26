import java.util.Scanner;

public class NinthExercise {
    public static void main(String[] args) {
        int x1, y1, x2, y2, x3, y3;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x1:");
        x1 = in.nextInt();
        System.out.println("Enter y1:");
        y1 = in.nextInt();
        System.out.println("Enter x2:");
        x2 = in.nextInt();
        System.out.println("Enter y2:");
        y2 = in.nextInt();
        System.out.println("Enter x3:");
        x3 = in.nextInt();
        System.out.println("Enter y3:");
        y3 = in.nextInt();

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("On one straight line.");
        } else {
            System.out.println("Not on one straight line.");
        }

    }
}
