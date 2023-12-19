package problemsolving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoCharactor {

    public static Character[] getUniqCharacters(String s) {
        // get set of uniq characters in the string
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        // get an array, because set doesn't support get by index method
        return set.toArray(new Character[0]);
    }

    // O(n)
    public static int getLengthForAlteringChars(String s, Character char1, Character char2) {
        int length = 0;
        Character prev = null;
        for (int k = 0; k < s.length(); k++) {
            char curr = s.charAt(k);
            // skip any characters that are not in "selected pair"
            if (curr != char1 && curr != char2) {
                continue;
            }
            // if string is not altering, the string is invalid
            if (prev != null && prev == curr) {
                return 0;
            }
            prev = curr;
            length++;
        }
        return length;
    }

    // O(m^2*n) where m is number of uniq characters in string with length n
    public static int alternate(String s) {
        Character[] chars = getUniqCharacters(s);

        int maxLength = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                // get uniq pair of characters
                char char1 = chars[i];
                char char2 = chars[j];

                int length = getLengthForAlteringChars(s, char1, char2);

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    public static void main(String []arg) {
        //System.out.println(alternate("beabeefeab"));

//        String tmp = new String(s).toLowerCase();
//        String original = "abcdefghijklmnopqrstuvwxyz";
//        String result="";
//        for (int i =0; i<s.length(); i++) {
//            int index = original.indexOf(tmp.charAt(i));
//            boolean isUpper = Character.isUpperCase(s.charAt(i));
//            if (index >= 0) {
//                index = (index+ k) % 26;;
//                result += isUpper? String.valueOf(original.charAt(index)).toUpperCase() : original.charAt(index);
//                continue;
//            }
//            result += s.charAt(i);
//        }String s = "middle-Outz";
//        int k=2;

        String s = "hereiamstackerrank";
        String h = "hackerrank";
        String me = "We promptly #$%*judged antique ivory buckles for the next prize";
        int j=0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == h.charAt(j)) j++;
        }
        System.out.println(j == h.length()? "YES":"NO");

//        String me1 = me.replaceAll("[^a-zA-Z]","");
//                     me.replaceAll("[^a-zA-Z]","");
        System.out.println(Arrays.stream(me.replaceAll("[^a-zA-Z]","").chars().toArray()).distinct().count());

        System.out.println(me.replaceAll("[^a-zA-Z]",""));
        String str= "This#string%contains^special*characters&.";
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);

        Arrays.asList(str.toLowerCase()).stream();
        StringBuilder builder = new StringBuilder(str);
        System.out.println(builder.reverse().toString());

        String st= "acxz";
        List<Integer> ascii = st.chars().mapToObj(st1 -> (Integer) st1).collect(Collectors.toList());
    }
}
