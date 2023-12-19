package leecode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicate {

    public static int[] findDuplicate(int []arr) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int ar : arr) {
            myMap.put(ar, myMap.getOrDefault(ar,0) +1);
        }
        for(Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            if(entry.getValue() >= 2) result.add(entry.getKey());
        }
        return result.stream().mapToInt(i->i).toArray();
    }

    public static void main(String []arg) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int[] re = findDuplicate(arr);
    }
}
