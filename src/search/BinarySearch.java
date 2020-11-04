package search;

import java.io.IOException;

public class BinarySearch {

    public static void main(String[] args) throws IOException {
//        int[] arr = {2,4 ,3 ,5,20 ,2 ,6,4,10 ,5};
        int[] arr = {1,2,3,4,5,6,7,8,9,10,20,30};
        System.out.println(search(arr,5));

    }

    private static int search(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length-1;
        while (lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == key) return mid;
            else if (arr[mid] > key) hi = mid -1;
            else if(arr[mid] < key) lo=mid+1;
        }
        return -1;
    }

}
