package job.wisetech;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DegreeOfArray {

    public static int degreeOfArray(List<Integer> arr) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int maxNumber = 0;
        int minResult = Integer.MAX_VALUE;
        for (int ar : arr) {
            int count = myMap.getOrDefault(ar,0) + 1;
            myMap.put(ar, count);
            maxNumber = Math.max(maxNumber, count);
        }
        for(Map.Entry<Integer,Integer> entry : myMap.entrySet()) {
            if(entry.getValue() == maxNumber) {
                minResult = Math.min(findSubArrayLenght(arr, entry.getKey(), maxNumber), minResult);
            }
        }
        return minResult;

    }

    private static int findSubArrayLenght(List<Integer> arr, int a, int max) {
        int count = 0;
        boolean startCount = false;
        int j=0;
        for(int ar : arr) {
            if(a == ar) {
                startCount = true;
                j++;
            }
            if(startCount) count++;
            if(max == j) return count;
        }
        return 0;
    }

    public static void main(String arg[]) {
        Integer[] arr = {1,2,2,3,1};
        System.out.println(degreeOfArray(Arrays.asList(arr)));
    }

}
