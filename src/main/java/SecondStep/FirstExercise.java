package SecondStep;

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        int k, n, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the dimension of the array:");
        n = in.nextInt();
        System.out.println("Enter number 2-100:");
        k = in.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = (int) (Math.random() * 100);
            System.out.print(mas[i] + " ");
            if (mas[i] % k == 0) {
                sum += mas[i];
            }
        }
        System.out.println(" ");
        System.out.println("The sum of the elements is a multiple " + "\"" + k + "\"" + " = " + sum);
    }
}
