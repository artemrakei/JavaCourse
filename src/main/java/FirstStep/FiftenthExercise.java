package FirstStep;

import java.math.BigInteger;

public class FiftenthExercise {
    public static int getSquare(int number) {

        int result = number * number;
        return result;
    }

    public static void main(String[] args) {

        BigInteger bigInteger = new BigInteger("1");
        for (int i = 1; i <= 200; i++) {
            BigInteger b = new BigInteger(String.valueOf(getSquare(i)));
            bigInteger = bigInteger.multiply(b);
        }
        System.out.println(bigInteger);
    }
}
