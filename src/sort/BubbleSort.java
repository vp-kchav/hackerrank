/*
 * Created on Apr 11, 2018
 */
package sort;


public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        for(int i = (arr.length - 1); i >= 0; i--) {
            for(int j=1;j<=i;j++) {
                if(arr[j-1] > arr[j]) {
                    int tem = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]= tem;
                }
            }
        }
    }
    public static void main(String arg[]) {
    	int arr[] = {6,4,3,5,2,1};
    	bubbleSort(arr);
        int indexNode1 = findIndex(arr,2);
        int indexNode2 = findIndex(arr,4);
        System.out.println("sdfds");
        
    }
    
    public static int findIndex(int[] arr, int item) {
        for (int i=0;i<arr.length;i++) {
           if (item == arr[i]) {
              return i;
           }
        }
        return -1;
     }
   
     
     
}
