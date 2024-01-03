package problemsolving;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * orting is useful as the first step in many different tasks. The most common task is to make finding things easier, but there are other uses as well. In this case, it will make it easier to determine which pair or pairs of elements have the smallest absolute difference between them.
 *
 * Example
 *
 * Sorted, . Several pairs have the minimum difference of : . Return the array .
 *
 * Note
 * As shown in the example, pairs may overlap.
 *
 * Given a list of unsorted integers, , find the pair of elements that have the smallest absolute difference between them. If there are multiple pairs, find them all.
 */
public class ClosestNumber {
    public static List<Integer> closestNumbers(List<Integer> arr) {
        int min = Integer.MAX_VALUE;
        Collections.sort(arr);
        Map<Integer, List<Integer>> myMap = new HashMap<>();
        for(int i =0; i<arr.size()-1; i++) {
            int diff = arr.get(i+1) - arr.get(i);
            min = Math.min(diff, min);
            List<Integer> pair =  Stream.of( arr.get(i), arr.get(i+1)).collect(Collectors.toList());
            if(myMap.get(diff) == null) {
                myMap.put(diff,pair);
            } else {
                myMap.get(diff).addAll(pair);
            }
        }
        return myMap.get(min);
    }

    public static void main(String arg[]) {
        List<Integer> list = Stream.of(1,2,3,4,5).collect(Collectors.toList());
        System.out.println(closestNumbers(list)); //[1, 2, 2, 3, 3, 4, 4, 5]
    }

}
