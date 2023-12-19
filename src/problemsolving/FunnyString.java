package problemsolving;

import java.util.List;
import java.util.stream.Collectors;

public class FunnyString {

    public static String funnyString(String s) {
        String r = new StringBuilder(s).reverse().toString();
        List<Integer> lsts = s.chars().mapToObj(st -> (Integer)st).collect(Collectors.toList());
        List<Integer> lstr = r.chars().mapToObj(rt -> (Integer)rt).collect(Collectors.toList());
        boolean funny = true;
        for(int i=0;i<lstr.size()-1;i++) {
            if (Math.abs(lsts.get(i) - lsts.get(i+1)) != Math.abs(lstr.get(i) - lstr.get(i+1))) {
                funny=false;
                break;
            }
        }
        return funny? "Funny":"Not Funny";
    }

    public static void main(String arg[]) {
        System.out.println("abxz");
    }
}
