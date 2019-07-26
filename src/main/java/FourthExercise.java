import java.util.Scanner;

public class FourthExercise {
    public static void main(String[] args) {
        String str, strRes;
        double a;
        int b, c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number :");
        a = in.nextDouble();
        str = Double.toString(a);
        c = str.length();
        b = str.indexOf('.');
        strRes = str.substring(b + 1, c) + "." + str.substring(0, b);
        a = Double.parseDouble(strRes);
        System.out.println(a);
    }
}
