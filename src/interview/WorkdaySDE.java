package interview;

import java.io.IOException;

public class WorkdaySDE {

    public static int reductionCost(int[] arr) {
        int[] newArray = new int[arr.length];
        int sum = 0;
        while (arr.length > 2) {
           sortArray(arr);
           newArray = new int[arr.length -1];
           for(int i=2 ;i<arr.length;i++) {
               newArray[i-2] = arr[i];
           }
           sum +=arr[0] + arr[1];
           newArray[newArray.length-1] = arr[0] + arr[1];
           arr = newArray;
        }
        sum +=arr[0] + arr[1];
        return sum;
    }

    public static void sortArray(int[] array) {
        for(int i=0; i<array.length-1; i++) {
            for(int j = i; j<array.length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
//        int[] arr = {2,4 ,3 ,5,20 ,2 ,6,4,10 ,5};
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(reductionCost(arr));
    }
}
