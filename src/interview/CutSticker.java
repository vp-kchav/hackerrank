package interview;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CutSticker {

    private static List<Integer> cutStick(int[] arr) {
        List<Integer> result = new ArrayList<>();
        while (arr.length > 0) {
            result.add(arr.length);
            int[] min = findMin(arr);
            int[] newArray = new int[arr.length - min[1]];
            int j=0;
            for(int i: arr) {
                if(i > min[0]) {
                    newArray[j] = i -min[0];
                    j++;
                }
            }
            arr=newArray;
        }
        return result;
    }

    private static int[] findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int count =0;
        for(int i: arr) {
            if(min > i) {
                min = i;
                count = 1;
            } else if(min == i) {
                count++;
            };
        }
        int[] result =  {min, count};
        return result;
    }

    public static void main(String[] args) throws IOException {
//        int[] arr = {2,4 ,3 ,5,20 ,2 ,6,4,10 ,5};
//        int[] arr = {5,4,4,2,2,8};
        int[] arr = {1,1,2,3};
        List<Integer> result = cutStick(arr);
        for(int re : result) {
            System.out.println(re);
        }
    }
}
