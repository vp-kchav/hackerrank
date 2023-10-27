package algorithm;

import java.math.BigInteger;

public class TaumGift {

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here
        //int basePrice = 0;
        if (Math.abs(bc - wc) > z) {
            long bPrice, wPrice;
            if (bc > wc) {
                bPrice = wc+z;
                wPrice = wc;
            } else {
                wPrice = bc+z;
                bPrice = bc;
            }
            BigInteger priceb = BigInteger.valueOf(b).multiply(BigInteger.valueOf(bPrice));
            BigInteger pricew = BigInteger.valueOf(w).multiply(BigInteger.valueOf(wPrice));
            return priceb.add(pricew).longValue();
        } else {
            BigInteger priceb = BigInteger.valueOf(bc).multiply(BigInteger.valueOf(b));
            BigInteger pricew = BigInteger.valueOf(wc).multiply(BigInteger.valueOf(w));
            return priceb.add(pricew).longValue();
        }

    }

    public static void main(String arg[]) {
        Long result = taumBday(94419985 ,25938418 ,969098, 809449, 472449);
        System.out.println(result);
    }
}
