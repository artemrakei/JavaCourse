package FirstStep;

import java.util.Scanner;

public class NineteenthExercise {


    public static void main(String[] args) {
        double a, b;
        String str;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        a = in.nextDouble();
        System.out.println("Enter second number:");
        b = in.nextDouble();
        str = String.valueOf(a);
        System.out.println("The first number consists of the following digits:");
        getDigits(str);
        System.out.println(" ");
        str = String.valueOf(b);
        System.out.println("The second number consists of the following digits:");
        getDigits(str);

    }

    public static void getDigits(String s) {
        char[] digits = new char[s.length()];
        char symb;
        int k = 0, q = 0;
        for (int i = 0; i < s.length(); i++) {
            symb=s.charAt(i);
            if (i == s.length() - 1) {
                symb=s.charAt(i);
                if (symb == '0') {
                    break;
                }
            }
            if (symb == '.') {
                continue;
            }
            if (Character.isDigit(s.charAt(i))) {
                if (k != 0) {

                    for (int j = 0; j < s.length(); j++)
                        if (digits[j] == symb) {
                            q++;
                        }
                    if (q == 0) {
                        digits[k] = symb;

                    } else {
                        q = 0;
                        continue;
                    }

                } else {
                    digits[k] = symb;
                }
            }
            System.out.print(digits[k] + " ");
            k++;

        }
    }
}
