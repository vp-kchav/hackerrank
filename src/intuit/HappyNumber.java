package intuit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Software Engineer 1, Software Engineer 2 and Senior Software Engineer
public class HappyNumber {
    public static void main(String [ ] args) {
//        List<Integer> input = new ArrayList<>();
//
//        input.add(7);
//        input.add(105);
//        input.add(13);
//        input.add(1);
//        input.add(4);
//        input.add(0);
//        input.add(-2);
//        input.add(784);
        int[] input = {3,4,5,6,7,8,9};
        for(Integer i : input) {
            if (isHappy(i)) {
                System.out.println(i + ",");
            }
        }
    }

    public static int happify(int n) {
        int sum = 0;
        while (n > 0) {
            sum += sqr(n % 10);
            n /= 10;
        }
        return sum;
    }

    public static int sqr(int n) {
        return (n * n);
    }

    public static boolean isHappy(int n) {
        if (n == 1) {
            return true;
        } else if (n == 0){
            return false;
        } else {
            return isHappy(happify(n));
        }
    }
}
