package algorithm;

import java.util.ArrayList;
import java.util.List;

public class ManasaAndStone {
    public static List<Integer> stones(int n, int a, int b) {
        List<Integer> result = new ArrayList<>();
        int minAB = Math.min(a, b);
        int maxAB = Math.max(a, b);
        for (int i = minAB * (n - 1); i < maxAB * (n - 1); i += Math.abs(b - a)) {
            result.add(i);
        }
        result.add(maxAB * (n - 1));
        return result;
    }

    public static void main(String arg[]) {
        List<Integer> stone = stones(4,10,100);
    }
}
