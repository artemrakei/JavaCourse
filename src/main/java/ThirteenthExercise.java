import java.util.Scanner;

public class ThirteenthExercise {
    public static void main(String[] args) {
        int a, b, h, y;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextInt();
        System.out.println("Enter b:");
        b = in.nextInt();
        System.out.println("Enter h:");
        h = in.nextInt();
        if (a < b) {
            for (int i = a; i <= b; i = i + h) {
                if (i > 2) {
                    y = i;
                    System.out.println("y = " + y);
                } else {
                    y = -i;
                    System.out.println("y = " + y);
                }
            }
        } else {
            for (int i = a; i >= b; i = i - h) {
                if (i > 2) {
                    y = i;
                    System.out.println("y = " + y);
                } else {
                    y = -i;
                    System.out.println("y = " + y);
                }
            }
        }
    }
}
