package algorithm;

import java.util.Arrays;
import java.util.List;

public class ChocolateFeast {
    public static int chocolateFeast(int n, int c, int m) {
        int number = 0;
        number += n / c;
        int wrapper = number;
        while(wrapper >= m) {
            int moreC = wrapper/m;
            int left = wrapper % m;
            wrapper = moreC + left;
            number += moreC;
        }
        return number;
    }

    public static void main(String arg[]) {
        int result = chocolateFeast(10,2,5);
        System.out.println(result);
    }
}
