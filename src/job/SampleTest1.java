/*
 * Created on Feb 25, 2018
 */
package job;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SampleTest1 {
    static String findNumber(int[] arr, int k) {
        for(int i =0; i<arr.length;i++) {
            if(arr[i] == k) {
                return "YES";
            }
        }
        return "NO";
    }
    
    static int[] oddNumbers(int l, int r) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i =l;i<=r;i++) {
            if(i%2 != 0) {
                result.add(i);
            }
        }
        int num[] = new int[result.size()];
        for(int j=0;j< result.size();j++) {
            num[j] = result.get(j);
        }
        Set<Integer> set = new HashSet<Integer>();
        return num;
    }
    
    public static void main(String arg[]) {
        int res[] = oddNumbers(3, 5);
    }
}
