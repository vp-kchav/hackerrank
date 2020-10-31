/*
 * Created on Feb 24, 2018
 */
package implementation;

import java.util.Scanner;

public class DayOfProgrammer {
	
    static String solve(int year){
        int d = 13;
        if(year<1918) {
           if(year % 4 ==0) {
               d = 12;
           }
        } else if(year>1918) {
            if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
              d =12;
            }
        } else {
            d= 26;
        }
        return d+".09."+year;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
