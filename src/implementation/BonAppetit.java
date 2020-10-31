/*
 * Created on Feb 25, 2018
 */
package implementation;

import java.util.Scanner;

public class BonAppetit {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int c = in.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++) {
            if(i != k) {
                sum+=s[i]; 
            }
        }
        if(sum/2 == c) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(c -sum/2);
        }
    }

}
