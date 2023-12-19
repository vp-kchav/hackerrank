package problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeightUniformString {
    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        String original = "0abcdefghijklmnopqrstuvwxyz";
        List<String> result = new ArrayList<>();
        List<Integer> weights = new ArrayList<>();
        int sum = original.indexOf(s.charAt(0));
        for(int i=1; i<s.length();i++) {
            weights.add(sum);
            if(s.charAt(i) == s.charAt(i-1)) {
                sum += original.indexOf(s.charAt(i));
                continue;
            }
            sum = original.indexOf(s.charAt(i));
        }
        weights.add(sum);
        System.out.println(weights);
        for(int q : queries) {
            result.add(weights.contains(q) ? "Yes": "No");
        }
        return result;
    }

    public static void main(String arg[]) {
        Integer[] q = {1,3,12,5,9,10};
        System.out.println(weightedUniformStrings("abbccddde", Arrays.asList(q)));
    }
}
