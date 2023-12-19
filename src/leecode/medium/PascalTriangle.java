package leecode.medium;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static List<List<Integer>> generate(int nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> pre= null;
        for(int i=0; i<nums; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                if (j==0 || j == i){
                    list.add(1);
                } else {
                    list.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = list;
            result.add(list);
        }

        return result;
    }
    public static void main(String arg[]) {
        System.out.println(generate(10));
    }
}
