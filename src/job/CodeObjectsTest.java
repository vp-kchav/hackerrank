/*
 * Created on Feb 25, 2018
 */
package job;

import java.util.Scanner;

public class CodeObjectsTest {
    
    

    public static int getSmallest(int n) {
        for(int i = 11;i<=n;i++) {
            if(isPrime(i)) {
                return i;
            }
        }
        return 0;
    }
    
    static boolean isPrime(long n){
        if(n > 2 && (n & 1)==0){
            return false;
        }
        for(int i=3; i*i <= n; i+=2){
            if(n % i== 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int result=0;
        if(input <= 10) {
            System.out.println("Please Input number lager that 10!!!");
        }else {
            result = getSmallest(input);
        }
        System.out.println(result);
    }

}
