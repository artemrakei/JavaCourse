import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Math.*;

public class FirstStep {

    public static int getIntNumber() {
        int a;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        return a;
    }

    public static double getDoubleNumber() {
        double a;
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        return a;
    }

    public static void firstExercise() {
        int z, a, b, c;
        System.out.println("Enter a:");
        a = getIntNumber();
        System.out.println("Enter b:");
        b = getIntNumber();
        System.out.println("Enter c:");
        c = getIntNumber();
        z = ((a - 3) * (b / 2)) + c;
        System.out.println("Your result z:" + z);
    }


    public static void secondExercise() {
        double z, a, b, c;
        System.out.println("Enter a:");
        a = getIntNumber();
        System.out.println("Enter b:");
        b = getIntNumber();
        System.out.println("Enter c:");
        c = getIntNumber();
        z = ((b + (sqrt(b * b + (4 * a * c)))) / (2 * a)) - (((a * a * a) * c) + (1 / (b * b)));
        System.out.println("Your result z:" + z);
    }


    public static void thirdExercise() {
        double result, x, y;
        System.out.println("Entry x");
        x = getDoubleNumber();
        System.out.println("Entry y");
        y = getDoubleNumber();
        result = ((sin(x) + cos(y)) / (cos(x) - sin(y))) * (tan(x * y));
        System.out.println(result);
    }


    public static void fourthExercise() {
        String str, strRes;
        double a;
        int b, c;
        System.out.println("Enter number :");
        a = getDoubleNumber();
        str = Double.toString(a);
        c = str.length();
        b = str.indexOf('.');
        strRes = str.substring(b + 1, c) + "." + str.substring(0, b);
        a = Double.parseDouble(strRes);
        System.out.println(a);
    }

    public static void fifthExercise() {
        int a, sec, min, hours;
        System.out.println("Enter number:");
        a = getIntNumber();
        sec = a % 100;
        min = (a / 100) % 100;
        hours = a / 10000;
        System.out.println(hours + "ч " + min + "мин " + sec + "c");
    }

    public static void sixthExercise() {
        double x, y;
        System.out.println("Enter x:");
        x = getDoubleNumber();
        System.out.println("Enter y:");
        y = getDoubleNumber();
        if ((x >= -2 && x <= 2 && y >= -3 && y <= 4) || (x >= -4 && x < -2 && y <= 0 && y >= -3) || (x > 2 && x <= 4 && y <= 0 && y >= -3)) {
            System.out.println("In");
        } else {
            System.out.println("Out");
        }
    }

    public static void seventhExercise() {
        double first, second;
        System.out.println("Enter x:");
        first = getDoubleNumber();
        System.out.println("Enter y:");
        second = getDoubleNumber();
        if (first + second >= 180) {
            System.out.println("does not exist");
        } else if (first + second == 90) {
            System.out.println("right triangle");
        } else {
            System.out.println("exist");
        }
    }

    public static void eighthExercise() {
        int a, b, c, d;
        System.out.println("Enter a:");
        a = getIntNumber();
        System.out.println("Enter b:");
        b = getIntNumber();
        System.out.println("Enter c:");
        c = getIntNumber();
        System.out.println("Enter d:");
        d = getIntNumber();
        if (a > b) {
            a = b;
        }
        if (c > d) {
            c = d;
        }
        if (a < c) {
            a = c;
        }
        System.out.println(a);
    }

    public static void ninthExercise(String[] args) {
        int x1, y1, x2, y2, x3, y3;
        System.out.println("Enter x1:");
        x1 = getIntNumber();
        System.out.println("Enter y1:");
        y1 = getIntNumber();
        System.out.println("Enter x2:");
        x2 = getIntNumber();
        System.out.println("Enter y2:");
        y2 = getIntNumber();
        System.out.println("Enter x3:");
        x3 = getIntNumber();
        System.out.println("Enter y3:");
        y3 = getIntNumber();
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("On one straight line.");
        } else {
            System.out.println("Not on one straight line.");
        }
    }

    public static void tenthExercise() {
        int a, b, x, y, z;
        System.out.println("Enter A:");
        a = getIntNumber();
        System.out.println("Enter B:");
        b = getIntNumber();
        System.out.println("Enter x:");
        x = getIntNumber();
        System.out.println("Enter y:");
        y = getIntNumber();
        System.out.println("Enter z:");
        z = getIntNumber();
        if ((a > x && (b > y || b > z)) || (a > y && (b > x || b > z)) || (a > z && (b > y || b > x))) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }
    }

    public static void eleventhExercise() {
        double x, result;
        System.out.println("Enter x:");
        x = getDoubleNumber();
        if (x > 3) {
            result = 1 / ((x * x * x) + 6);
            System.out.println("F(x)=" + result);
        } else {
            result = (x * x) - (3 * x) + 9;
            System.out.println("F(x)=" + result);
        }
    }


    public static void twelfthExercise() {
        int a, sum = 0;
        System.out.println("Enter number:");
        a = getIntNumber();
        for (int i = 0; i <= a; i++) {
            sum += i;
        }
        System.out.println("Your sum = " + sum);
    }

    public static void thirteenthExercise() {
        int a, b, h, y;
        System.out.println("Enter a:");
        a = getIntNumber();
        System.out.println("Enter b:");
        b = getIntNumber();
        System.out.println("Enter h:");
        h = getIntNumber();
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

    public static void fourtenthExercise() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + getSquare(i);
        }
        System.out.println(sum);
    }

    public static int getSquare(int number) {
        int result = number * number;
        return result;
    }

    public static void fiftenthExercise() {
        BigInteger bigInteger = new BigInteger("1");
        for (int i = 1; i <= 200; i++) {
            BigInteger b = new BigInteger(String.valueOf(getSquare(i)));
            bigInteger = bigInteger.multiply(b);
        }
        System.out.println(bigInteger);
    }


    public static void sixtenthExercise() {
        int e, n = 1;
        double a = ((1 / 2) + (1 / 3)), result = 0;
        System.out.println("Enter e:");
        e = getIntNumber();
        do {
            n++;
            a = 1 / (pow(2, n)) + 1 / (pow(3, n));
            result = result + a;
        } while (e <= abs(a));
        System.out.println(result);
    }

    public static void sevententhExercise() {
        char symbol;
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter symbol:");
        symbol = in.next().charAt(0);
        number = symbol;
        System.out.println("Number of this number: " + number);
    }

    public static void eightenthExercise() {
        int m, n, min, max;
        System.out.println("Enter m:");
        m = getIntNumber();
        System.out.println("Enter n:");
        n = getIntNumber();
        if (m < n) {
            min = m;
            max = n;
        } else {
            min = n;
            max = m;
        }
        for (int i = min; i <= max; i++) {
            System.out.println("number = " + i);
            if (min < 0) {
                for (int j = min; j < 0; j++) {
                    if ((i % j == 0) && (abs(j) != 1) && (abs(j) != abs(i))) {
                        if (i == 0) {
                            continue;
                        }
                        System.out.print(abs(j) + " ");
                    }
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    if ((i % j == 0) && (j != 1) && (j != i) && (j != 0)) {
                        System.out.print(j + " ");
                    }
                }
            }
            System.out.println("");
        }
    }

    public static void nineteenthExercise() {
        double a, b;
        String str;
        System.out.println("Enter first number:");
        a = getDoubleNumber();
        System.out.println("Enter second number:");
        b = getDoubleNumber();
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
            symb = s.charAt(i);
            if (i == s.length() - 1) {
                symb = s.charAt(i);
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