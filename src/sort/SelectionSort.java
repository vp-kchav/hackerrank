/*
 * Created on Apr 11, 2018
 */
package sort;


public class SelectionSort {
    
    public static void selectionSort(int []arr) {
        for(int i = 0; i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                            
                }
            }
        }
    }
    
    public static void main(String arg[]) {
        int []arr = {4,6,3,8,9,1};
        selectionSort(arr);
        for(int a : arr) {
            System.out.print(a+" ");
        }
    }

}
