package problemsolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TwoCharacter {

    public static int alternate(String s) {
        HashSet<Character> uniqueChars = new HashSet<>();
        int maxLength = 0;

        //find unique character within the String
        for (char c : s.toCharArray()) {
            uniqueChars.add(c);
        }

        for (char char1 : uniqueChars) {
            for (char char2 : uniqueChars) {
                if (char1 != char2) {
                    StringBuilder validString = new StringBuilder();
                    for (char c : s.toCharArray()) {
                        if (c == char1 || c == char2) {
                            validString.append(c);
                        }
                    }
                    if (isAlternating(validString.toString()) && validString.length() > maxLength) {
                        maxLength = validString.length();
                    }
                }
            }
        }

        return maxLength;
    }

    public static boolean isAlternating(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }


    public static int alternateMe(String s) {
        //find unique character
        List<String> uniqueChar = new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            if(!uniqueChar.contains(String.valueOf(s.charAt(i)))) uniqueChar.add(String.valueOf(s.charAt(i)));
        }
        int longest = 0;
        for(int i=0; i<uniqueChar.size()-1;i++) {
            for(int j=i+1;j<uniqueChar.size();j++) {
                String req = "[^" + uniqueChar.get(i)+uniqueChar.get(j) + "]";
                String validString = s.replaceAll(req,"");
                if(isAlternating(validString)) longest = Math.max(longest, validString.length());
            }
        }
        return longest;
    }

    private boolean isValidString(String str) {
        for(int i =0; i<str.length()-1;i++) {
            if(str.charAt(i) == str.charAt(i+1)) return false;
        }
        return true;
    }

    public static void main(String arg[]) {
        System.out.println(alternate("beabeefeab"));
        alternateMe("beabeefeab");
    }
}
