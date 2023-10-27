package algorithm;

import java.util.Arrays;
import java.util.List;

public class PickingNumber {
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int x = 0;
        int count = 0;
        int result = 0;
        for (int i = 0; i < a.size(); i++) {
            x = a.get(i);
            for (int j = 0; j < a.size(); j++) {

                if (x + 1 == a.get(j) || x == a.get(j))
                    count++;

                if (count > result) result = count;
            }
            count = 0;
        }
        return result;

    }

    public static void main(String arg[]) {
        List<Integer> arr = Arrays.asList(4,6,5,3,3,1);
        int result = pickingNumbers(arr);
        System.out.println(result);
    }
}
