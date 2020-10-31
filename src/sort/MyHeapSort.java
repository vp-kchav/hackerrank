/*
 * Created on Apr 22, 2018
 */
package sort;

public class MyHeapSort {

    public static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void sort(int[] arr) {
        //heaplify the array
        int lenght = arr.length;
        for (int i = lenght / 2 - 1; i >= 0; i--) {
            heaplifyArray(arr, lenght, i);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            swap(arr,0,i);
            //re heaplify again after swap 
            heaplifyArray(arr, i, 0);
        }

    }

    public static void heaplifyArray(int[] arr, int n, int i) {
        int largest = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            //swap 
            swap(arr,i,largest);

            //heaplify again after swap
            heaplifyArray(arr, n, largest);
        }
    }
    
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String args[]) {
        int arr[] = {5, 6, 7,12, 11, 13,1,3};
        //int arr[] = { 7, 11, 13, 5, 8 };
//        int n = arr.length;

        //        HeapSort ob = new HeapSort();
        sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }

}
