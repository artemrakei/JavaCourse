import java.util.Scanner;

public class EleventhExercise {


    public static void main(String[] args) {
        double x, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x:");
        x = in.nextDouble();
        if (x > 3) {
            result = 1 / ((x * x * x) + 6);
            System.out.println("F(x)=" + result);
        } else {
            result = (x * x) - (3 * x) + 9;
            System.out.println("F(x)=" + result);
        }
    }

}
