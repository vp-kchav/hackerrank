/*
 * Created on Apr 14, 2018
 */
package sort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClosetNumber {
    static int[] closestNumbers(int[] arr) {
        int[] sorted = sortArray(arr);
        int dif = 100000000;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<sorted.length-1;i++) {
            int sDif = sorted[i+1] - sorted[i]; 
            if(sDif <= dif) {
                if(sDif < dif) list.clear();
                list.add(sorted[i]);
                list.add(sorted[i+1]);
                dif = sDif;
            }
        }
        int []result = new int[list.size()];
        for(int k = 0; k<list.size();k++) {
            result[k] = list.get(k);
        }
        return result;
    }
    
    static int[] sortArray(int[] arr) {
        for(int i = arr.length-1;i>0;i--) {
            for(int j=0;j<i;j++) {
//                s.asl
                if(arr[i]<arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
        int n = 10;//in.nextInt();
        int[] arr = {-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854};//new int[n];
//        for(int arr_i = 0; arr_i < n; arr_i++){
//            arr[arr_i] = in.nextInt();
//        }
        int[] result = closestNumbers(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


//        in.close();
    }
}
