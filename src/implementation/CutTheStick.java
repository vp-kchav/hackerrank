/*
 * Created on Apr 12, 2018
 */
package implementation;

import java.util.Scanner;

public class CutTheStick {
    static int[] cutTheSticks(int[] arr) {
        int result[] = new int[arr.length];
        
        boolean con= true;
        int i = 1;
        result[0] = arr.length;
        while(con==true) {
            int min = findSmallest(arr);
            int countAM = countAndMinus(arr,min);
            if(countAM > 0){
                result[i] = countAM;    
            }else {
                con = false;
            }
            i++;
        } 
        return result;
    }
    
    static int countAndMinus(int []arr,int min){
        int count = 0;
        for(int i = 0 ; i<arr.length;i++) {
            if(arr[i] > 0) {
                if(arr[i] - min > 0) count++;
                arr[i]-=min;
            }
        }    
        return count;
    } 
    
    static int findSmallest(int[] arr) {
        int s = 1000;
        for(int i = 0; i<arr.length;i++) {
            if(arr[i] != 0 && arr[i] < s) s = arr[i];
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       //int n = 6;//in.nextInt();
        int[] arr = {5, 4, 4, 2, 2, 8};
//        for(int arr_i = 0; arr_i < n; arr_i++){
//            arr[arr_i] = in.nextInt();
//        }
        int[] result = cutTheSticks(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
