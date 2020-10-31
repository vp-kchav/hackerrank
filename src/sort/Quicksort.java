/*
 * Created on Apr 14, 2018
 */
package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quicksort {
    static int[] quickSort(int[] arr) {
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();
        int pivot = arr[0];
        for(int i = 1; i<arr.length; i++) {
            if(arr[i] < pivot) {
                left.add(arr[i]);
            } else {
                right.add(arr[i]);
            }
        }
        int result[] = new int[arr.length];
        for(int j =0;j<left.size();j++) {
            result[j] = left.get(j);
        }
        result[left.size()] = pivot;
        int k = 0;
        for(int j = left.size()+1;j<result.length;j++) {
            result[j] = right.get(k);
            k++;
        }
        List<Integer> list = new ArrayList<Integer>();
        list.clear();
         return result;
    }

//    static void doQuicksort(int []arr) {
//        while
//    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;//in.nextInt();
        int[] arr = {4, 5, 3, 7,2};//new int[n];
//        for(int arr_i = 0; arr_i < n; arr_i++){
//            arr[arr_i] = in.nextInt();
//        }
        int[] result = quickSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
