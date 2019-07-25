import java.util.Scanner;

public class FourthExercise {
    public static void main(String[] args) {
        String str, strRes;
        double a;
        int b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number :");
        a = in.nextDouble();
        str = Double.toString(a);
        b = str.indexOf('.');
        strRes = str.substring(0,b-1) + '.' + str.substring(b+1,str.length()-1);
        System.out.println(strRes);
    }
}
