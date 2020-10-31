/*
 * Created on Feb 16, 2018
 */
package dynamicprogramming;

import java.util.Scanner;

public class CoinChange {
    
    static long getWays(long n, long[] c){
        // Complete this function
//        Queue<Integer> q = new AbstractQueue<Integer>();
        
        return 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ways = getWays(n, c);
    } 
}
