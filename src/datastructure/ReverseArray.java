package datastructure;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {

    static int[] reverseArray(int[] a) {
        int[] result = new int[a.length];
        int j = 0;
        for(int i=a.length -1; i>=0;i--) {
            result[j] = a[i];
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = reverseArray(arr);
        System.out.println(result);
    }
}
