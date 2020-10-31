/*
 * Created on Feb 23, 2018
 */
package dynamicprogramming;

import java.util.Scanner;

public class SamAndSubString {
    //not yet done
    static int substrings(String balls) {
        int sum = 0;
        int mod=10;
        int whileC = 0;
        for(int i = 1; i<=balls.length(); i++) {
            Long intBalls = Long.valueOf(balls);
            while(intBalls > whileC) {
                sum +=intBalls%mod;
                intBalls = intBalls/10;
            }
            whileC=mod;
            mod*=10;
        }
        return sum;
    }

    public static void main(String[] args) {
//        System.out.println(123/100);
        Scanner in = new Scanner(System.in);
        String balls = in.next();
        int result = substrings(balls);
        System.out.println(result);
        in.close();
        
//        System.out.println("123".substring(0, 2));
    }
}
