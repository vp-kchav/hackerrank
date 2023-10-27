package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//WRONG
public class LeftRotation {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        //Collections.rotate();
        for (int i = 0; i<d; i++) {
            int id = i + a.size()-(d+1);
            a.set(i+1, a.get(id));
        }
        int count = 0;
        for (int j=d ; j<a.size(); j++) {
            int rotateValue = a.get(j);
            a.set(count, rotateValue);
            count++;
        }
        return a;
        // Write your code here
    }

    public static void main(String arg[]) {
        int me = 1234;
        int sum =0;
        while (me > 0){
            sum += me%10;
            me = me / 10;
        }

        int i = 4/10;
//        List<Integer> arr = Arrays.asList(41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51);
//        arr = rotLeft(arr, 10);
//        System.out.println(arr);
    }
}
