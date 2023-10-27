package algorithm;

import java.util.Arrays;
import java.util.List;

public class BeautifuTriplets {

    public static int beautifulTriplets(int d, List<Integer> arr) {
//        int count = 0;
//        for (int i = 0; i<arr.size()-2; i++) {
//            for (int j = i+1; j<arr.size()-1; j++) {
//                for (int k = j+1; k<arr.size(); k++) {
//                    if (arr.get(k) - arr.get(j) == arr.get(j) - arr.get(i) &&  arr.get(j) - arr.get(i) == d) {
//                        count++;
//                    }
//                }
//            }
//        }
//        return count;
        int count = 0;
        for(int i : arr){
            if(arr.contains(i+d) && arr.contains(i + d + d)){
                count++;
            }
        }
        return count;
    }

    public static void main(String arg[]) {
        int re = beautifulTriplets(3, Arrays.asList(1, 2, 4, 5, 7, 8, 10));
        System.out.println(re);
    }
}
