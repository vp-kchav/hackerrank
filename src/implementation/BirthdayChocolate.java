/*
 * Created on Feb 23, 2018
 */
package implementation;

import java.util.Scanner;

public class BirthdayChocolate {

    static int solve(int n, int[] s, int d, int m){
        int count = 0;
        for(int i=0;i<=n-m;i++) {
            int number = s[i];
            for(int j=1;j<m;j++) {
                number = number + s[i+j];
            }
            if(number == d) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println("Result: " + result);
    }

}
