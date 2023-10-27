package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MigratoryBird {
    public static int migratoryBirds(List<Integer> arr) {
        Collections.sort(arr);
        int maxCount = 1;
        int countType = 1;
        int number=0;
        for(int i=arr.size()-1; i >= 1; i--) {
            if(arr.get(i) == arr.get(i-1)) {
                ++countType;
            } else {
                if(countType >= maxCount) {
                    maxCount = countType;
                    number=arr.get(i);
                }
                countType=1;
            }
        }
        return number;
    }
    public static void main(String arg[]) {
        List<Integer> arr = Arrays.asList(1,4,4,4,5,3);
        int result = migratoryBirds(arr);
        System.out.println(result);
    }
}
