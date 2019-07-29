import java.util.Scanner;

public class SecondStep {

    public static int getIntNumber() {
        int a;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        return a;
    }

    public static int [] getIntMass(int a, int firstNumb, int secondNumb) {

        int [] mas = new int[a];
        for (int i = 0; i <a ; i++) {
           mas[i] =  (int) ((Math.random() * firstNumb)-secondNumb);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        return mas;
    }

    public static double getDoubleNumber() {
        double a;
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        return a;
    }

    public static void firstExercise() {
        int a, k, sum = 0;
        System.out.println("Enter the dimension of the array:");
        a = getIntNumber();
        System.out.println("Enter number 2-100:");
        k = getIntNumber();
        int[] mas = getIntMass(a,100,0);
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % k == 0) {
                sum += mas[i];
            }
        }
        System.out.println(" ");
        System.out.println("The sum of the elements is a multiple " + "\"" + k + "\"" + " = " + sum);
    }

    public static void secondExercise() {
        int a,z, sum = 0;
        System.out.println("Enter the dimension of the array:");
        a = getIntNumber();
        System.out.println("Enter Z 1-100:");
        z = getIntNumber();
        int[] mas = getIntMass(a,100,0);
        System.out.println(" ");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > z) {
                mas[i] = z;
                sum++;
            }
            System.out.print(mas[i] + " ");
        }
        System.out.println("\nSum = " + sum);
    }

    public static void thirdExercise() {
        int n, sumZero = 0, sumPos = 0, sumNeg = 0;
        System.out.println("Enter the dimension of the array:");
        n = getIntNumber();
        int[] mas = getIntMass(n,20,10);
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0) {
                sumPos++;
            } else if (mas[i] < 0) {
                sumNeg++;
            } else {
                sumZero++;
            }
        }
        System.out.println("\nSum positive = " + sumPos + "\nSum negative = " + sumNeg + "\nSum zero = " + sumZero);
    }

    public static void fourthExercise () {
        int n, min,max,idMin=0,idMax=0;
        System.out.println("Enter the dimension of the array:");
        n = getIntNumber();
        int[] mas = getIntMass(n,20,10);
        min=mas[0];
        max=mas[0];
        for (int i = 0; i <mas.length-1 ; i++) {
            if (min>mas[i+1]) {
                min=mas[i+1];
                idMin=i+1;
            } if (max<mas[i+1]) {
                max=mas[i+1];
                idMax=i+1;
            }
        }
        System.out.println();
        System.out.println("min ="+min + " " + idMin + "\n" +"max =" + max + " " + idMax);
        mas[idMin] = max;
        mas[idMax] = min;
        for (int i = 0; i <mas.length ; i++) {
            System.out.print(mas[i] + " ");
        }
    }

    public static void fifthExercise () {
        int n;
        System.out.println("Enter the dimension of the array:");
        n = getIntNumber();
        int[] mas = getIntMass(n,20,10);
        for (int i = 0; i <mas.length ; i++) {
            if (mas[i]<i) {
                System.out.print( mas[i] + " ");
            }
        }
    }

}
