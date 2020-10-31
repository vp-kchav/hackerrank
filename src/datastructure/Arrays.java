/*
 * Created on Feb 15, 2018
 */
package datastructure;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] arrays = new int[number];
        for(int i=0;i<number;i++) {
            arrays[i] = in.nextInt();
        }
        for(int j=number;j>0;j--) {
            System.out.print(arrays[j-1] + " ");
        }
    }

}
