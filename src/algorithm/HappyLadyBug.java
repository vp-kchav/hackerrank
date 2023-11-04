package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HappyLadyBug {
    public static String happyLadybugs(String b) {

        //There is no unhappy lady bug
        if(b.chars().count() == b.chars().filter(ch -> ch=='_').count()) return "YES";

        //Build all char to the Map
        Map<Character, Integer> containers = new HashMap<>();
        b.chars().forEach(c -> containers.put((char)c, containers.getOrDefault(c,0) + 1));

        //check if there is only one lady bug type
        for(Map.Entry<Character, Integer> myMap : containers.entrySet()) {
            if(myMap.getValue() == 1 && myMap.getKey() != '_') {
                return "NO";
            }
        }

        List<Character> allChars = new ArrayList<>(containers.keySet());
        //if there is '_' meaning we can move after checking all ladyBugs has team above
        if(!allChars.contains('_')){
            if(allChars.size() > 1) {
                for (int i = 1; i < b.length() - 1; i++) {
                    if (b.charAt(i - 1) == b.charAt(i) || b.charAt(i + 1) == b.charAt(i))
                        continue;
                    else return "NO";
                }
            }
        }
        return "YES";
    }

    public static void main(String arg[]) {
        System.out.println(happyLadybugsOther("RBY_YBR"));
//        for(String s : str) {
//            System.out.println(happyLadybugsOther(s));
//        }
        System.out.println(happyLadybugsOther("IIIAA"));

    }

    public static String happyLadybugsOther(String b) {
        Map<Character,Integer> lb = new HashMap<>();
        b.chars().forEach(c ->lb.put((char)c,lb.getOrDefault((char)c,0)+ 1));
        List<Character> k = new ArrayList<>(lb.keySet());
        //check if they are happy already
        for(Map.Entry<Character,Integer> e: lb.entrySet()) {
            if(e.getValue() == 1 && e.getKey() != '_') {
                return "NO";
            }
        }
        //established that there are keys are greater than 1
        if(!k.contains('_')) {
            if(k.size() > 1) {
                //check if all area already happy
                for(int i = 1; i < b.length() - 1; i++) {
                    if(b.charAt(i-1) == b.charAt(i) || b.charAt(i+1) == b.charAt(i))
                        continue;
                    else return "NO";
                }
            }
        }

        return "YES";
    }
}
