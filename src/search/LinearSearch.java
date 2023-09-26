package search;

public class LinearSearch {

    public static int linearSearch(int[]arr, int x) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchRecursioin(int[] arr, int size, int x) {
        if(size == 0) {
            return -1;
        } else if (arr[size-1] == x) return size - 1;
        return linearSearchRecursioin(arr, (size-1), x);
    }

    public static void main(String args[])
    {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;

        // Function call
        int result = linearSearchRecursioin(arr,arr.length, x);
        if (result == -1)
            System.out.print(
                    "Element is not present in array");
        else
            System.out.print("Element is present at index "
                    + result);
    }
}
