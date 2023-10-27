package algorithm;

import java.math.BigInteger;
import java.util.List;

public class KaprekaNumber {

    private static int sumNumber(long p, int digit) {
        int sum =0;
        while (p > 0) {
            sum += p%digit;
            p = p/digit;
        }
        return sum;
    }

    private static int findDigit(int p) {
        int digit =1;
        while (p > 0) {
            p = p/10;
            digit = digit*10;
        }
        return digit;
    }


    public static void kaprekarNumbers(int p, int q) {
        boolean foundOne = false;
        for (int i = p ; i<=q; i++) {
            int digit = findDigit(i);
            long number = BigInteger.valueOf(i).multiply(BigInteger.valueOf(i)).longValue();
            if(i == sumNumber(number, digit)) {
                foundOne = true;
                System.out.print(i+" ");
            }
        }
        if(!foundOne) System.out.print("INVALID RANGE");

    }

    public static void main(String arg[]) {
        kaprekarNumbers(1,99999);
    }
}
