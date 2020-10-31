/*
 * Created on Dec 25, 2017
 */
package implementation;

import java.util.Scanner;

public class AppleAndOrange {
    
    public static int resolve(int s, int t,int start , int[] fruits) {
        int count = 0;
        for(int fruit : fruits) {
            if(start + fruit <= t && start + fruit >= s) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        System.out.println(resolve(s,t,a,apple));
        System.out.println(resolve(s,t,b,orange));
    }

}
