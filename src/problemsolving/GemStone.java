package problemsolving;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * There is a collection of rocks where each rock has various minerals embeded in it. Each type of mineral is designated by a lowercase letter in the range . There may be multiple occurrences of a mineral in a rock. A mineral is called a gemstone if it occurs at least once in each of the rocks in the collection.
 *
 * Given a list of minerals embedded in each of the rocks, display the number of types of gemstones in the collection.
 *
 * Example
 *
 * The minerals  and  appear in each rock, so there are  gemstones.
 */
public class GemStone {
    public static int gemstones(List<String> arr) {
        //sort to get the least arr length first
        Set<Character> checkedStone = new HashSet<>();
        Collections.sort(arr);
        String firstList = arr.get(0);
        for(int i=0; i<firstList.length();i++) {
            boolean found = true;
            for(int j=1;j<arr.size();j++) {
                if(arr.get(j).indexOf(firstList.charAt(i)) < 0) {
                    found = false;
                    break;
                }
            }
            if(found) checkedStone.add(firstList.charAt(i));;
        }
        return checkedStone.size();
    }

    public static void main(String arg[]) {
        List<String> arr = Arrays.asList("abcdde", "baccd", "eeabg", "abc");
        System.out.println(gemstones(arr));
    }
}
