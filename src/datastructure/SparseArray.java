package datastructure;

import java.util.Arrays;

public class SparseArray {

    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] result = new int[queries.length];
        for(int i=0; i<queries.length;i++) {
            String query = queries[i];
            result[i] = Long.valueOf(Arrays.stream(strings).filter(s -> s.equals(query)).count()).intValue();

        }
        return result;
    }

    public static void main(String[] args) {
        String[] strings = {"ab","ab","abc"};
        String[] queries = {"ab","abc","bc"};
        System.out.println(matchingStrings(strings,queries));
    }
}
