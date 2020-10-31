/*
 * Created on Apr 12, 2018
 */
package implementation;

import java.util.HashSet;
import java.util.Set;

public class NotDivisionSubSet {
    static int nonDivisibleSubset(int k, int[] s) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0;i<s.length-1;i++) {
            for(int j = i+1; j<s.length;j++) {
                if((s[i] + s[j]) % k !=0 ) {
                    set.add(s[i]);
                    set.add(s[j]);
                }
            }
        }
        return set.size();
    }
    
    public static void main(String arg[]) {
        int []arr = {1,7,2,4};
        int r = nonDivisibleSubset(3, arr);
        System.out.println(r);
    }
}
