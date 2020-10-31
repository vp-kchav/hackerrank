/*
 * Created on Feb 11, 2018
 */
package LinkedPlacement;

import java.util.Scanner;

public class BinerayNumber {

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int maxNumberOne = 0;
        int maxOne = 0;
        String binaryString  = Integer.toBinaryString(number);
        for(int i = 0; i< binaryString.length(); i++) {
            if(binaryString.charAt(i) == '1') {
               maxOne++; 
            } else {
                if(maxNumberOne < maxOne) maxNumberOne = maxOne;
                maxOne=0;
            }
        }
        if(maxNumberOne < maxOne) maxNumberOne = maxOne;
        System.out.println(maxNumberOne);
    }
}
