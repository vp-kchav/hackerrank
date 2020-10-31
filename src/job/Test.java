/*
 * Created on Apr 15, 2018
 */
package job;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

    public static List<String> retrieveMostFrequentlyUsedWords(String literatureText, List<String> wordsToExclude) {
        // WRITE YOUR CODE HERE
        List<String> result = new ArrayList<String>();
        Set<String> words = new HashSet<>();
        List<String> resultText = new ArrayList<String>();
        int maxCount = 0;
        String[] splits = literatureText.split(" ");
        for (String split : splits) {
            String[] splitsPunc = split.split("'");
            for (String sp : splitsPunc) {
                if (!wordsToExclude.contains(sp)) {
                    result.add(split);
                    words.add(split);
                }
            }
        }
        for (String r : words) {
//            Integer.parseInt(r)
            int count = (int) result.stream().filter(s -> s.equalsIgnoreCase(r)).count();
            if (count > maxCount) {
                resultText.clear();
                resultText.add(r.toLowerCase());
                maxCount = count;
            }
            else if (count == maxCount) {
                if (!resultText.contains(r)) {
                    resultText.add(r.toLowerCase());
                }
            }
        }
        return resultText;
    }
    // METHOD SIGNATURE ENDS

    public static void main(String arg[]) {
        String s = "rose is a flower red rose are flower";
        List<String> s1 = new ArrayList<String>();
        s1.add("is");
        s1.add("are");
        s1.add("a");
        List<String> result = retrieveMostFrequentlyUsedWords(s, s1);
        for (String ss : result) {
        	System.out.println(ss);
        }
//      int i = 250;
//        List<String> lines = new ArrayList<String>();
//        byte  b= (byte)i;
//        System.out.println(b);
    }

}
