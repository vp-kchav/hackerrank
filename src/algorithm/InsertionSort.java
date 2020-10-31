/*
 * Created on Apr 11, 2018
 */
package algorithm;

public class InsertionSort {
    
    public int[] insertionSort(int[] arr) {
        for(int i = 1;i<arr.length; i++) {
            for(int j = i; j>0 ; j--) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
    
    
    
//    public static void main(String arg[]) {
//        int []arr = {4,6,3,8,9,1};
//        insertionSort(arr);
//        for(int a : arr) {
//            System.out.print(a+" ");
//        }
//    }

}
