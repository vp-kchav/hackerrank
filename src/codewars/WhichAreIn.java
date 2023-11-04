package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
//        List<String> result = new ArrayList<>();
//        for(String arr1 : array1) {
//            for(String arr2 : array2) {
//                if (arr2.contains(arr1)) {
//                    result.add(arr1);
//                    break;
//                }
//            }
//        }
//        Collections.sort(result);
//        return result.toArray(new String[0]);
        return Arrays.stream(array1).filter(arr1 ->
            Arrays.stream(array2).anyMatch(arr2 -> arr2.contains(arr1)))
                .distinct().sorted().collect(Collectors.toList()).toArray(new String[0]);
    }

    public static void main(String arg[]) {
        String []a1 = {"tarp", "mice", "bull", "arp"};
        String []a2 = {"lively", "alive", "harp", "sharp", "armstrong"};
        String[] result = inArray(a1, a2);
    }
}
