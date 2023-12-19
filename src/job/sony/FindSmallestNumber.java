package job.sony;

import java.util.Arrays;

public class FindSmallestNumber {

    public static int findSmallestNumber(int arr[]) {
        Arrays.sort(arr);
        int i=0;
        for(i=0; i<arr.length-1; i++) {
            if(arr[i] > 0) {
                if(arr[i] + 1 != arr[i+1]) {
                    return arr[i] + 1;
                }
            }
        }
        return arr[i] + 1 <= 0 ? 1: arr[i] +1;
     }

    public static void main(String arg[]) {
        int []arr1 = {1,2,3,5,6,7};
        int []arr2 = {-1,-2,-3,-5};
        int []arr3 = {1,2,3,4};
        System.out.println(findSmallestNumber(arr1));
        System.out.println(findSmallestNumber(arr2));
        System.out.println(findSmallestNumber(arr3));
    }
}
