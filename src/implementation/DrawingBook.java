/*
 * Created on Feb 25, 2018
 */
package implementation;

import java.util.Scanner;

public class DrawingBook {
    static int solve(int n, int p){
        // Complete this function
        int result = 0;
        if(p==1) return 0;
        if(n%2 ==0 && p==(n-1)) return 1;
        if(n%2 !=0 && p>=(n-1)) return 0;
        if(n/2 >= p) {
            result = p/2;
        }else {
            result = (n-p)/2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int p = in.nextInt();
        int result = solve(6, 5);
        System.out.println(result);
//        System.out.println(7/2);
    }
}
