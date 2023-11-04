package algorithm;

import java.util.Arrays;
import java.util.List;

public class FairRations {
    public static String fairRations(List<Integer> B) {
        int result = 0;

        for (int i = 0; i < B.size() ; i++){
            if (B.get(i)%2 != 0){
                if (i == B.size()-1) return "NO";
                B.set(i, B.get(i)+1);
                B.set(i+1, B.get(i+1)+1);
                result += 2;
            }
        }return Integer.toString(result);
    }

    public static void main(String []arg) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 7, 8);
        List<Integer> arr1 = Arrays.asList(2, 3,6, 7, 8);
        System.out.println(fairRations(arr));
        System.out.println(fairRations(arr1));

    }
}
