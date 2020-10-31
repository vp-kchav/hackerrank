/*
 * Created on Dec 25, 2017
 */
package implementation;

import java.util.Scanner;

public class Kangaroo {
    
    static String kangaroo(int x1, int v1, int x2, int v2) {
        String result = "NO";
        if( x1 > x2 && v1 > v2 || x1 < x2 && v1 < v2) {
            return "NO";
        } else {
            if((v1!=v2) && ((x2-x1)%(v1-v2))==0)
                result = "YES";
            else
                result = "NO";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }

}
