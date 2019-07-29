
import java.util.Scanner;

import static java.lang.Math.abs;

public class EightenthExercise {
    public static void main(String[] args) {
        int m, n, min, max;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter m:");
        m = in.nextInt();
        System.out.println("Enter n:");
        n = in.nextInt();
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
}
