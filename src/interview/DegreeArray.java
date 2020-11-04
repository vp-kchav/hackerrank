package interview;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DegreeArray {

    public static int findDegreeArray(int[] arr) {
        int max =0;
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> start = new HashMap<>();
        Map<Integer,Integer> end = new HashMap<>();
        for(int i =0; i<arr.length; i++){
            int value = arr[i];
            if(map.containsKey(value)) {
                map.put(value,map.get(value) + 1);
            } else {
                start.put(value,i);
                map.put(value,1);
            }
            end.put(value,i);
            max = Integer.max(max,map.get(value)); // find the degree array
        }
        int result = arr.length;
        System.out.println("degree is: " + max);
        for(int key : map.keySet()) {
            if(map.get(key) == max) {
                System.out.println("degree value is: " + key);
                int len = end.get(key) - start.get(key) + 1;
                result = Integer.min(len,result);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        int[] arr = {2,4 ,3 ,5,20 ,21 ,6,40,10 ,5,2};
        //int[] arr = {1,2,2,3,1};
        System.out.println(findDegreeArray(arr));
    }
}
