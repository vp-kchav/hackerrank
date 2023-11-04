package algorithm;

import java.util.Arrays;
import java.util.List;

public class LisaWorkBook {

    public static int workbook(int k, List<Integer> arr) {
        int specialProblem = 0;
        int pageNumber = 0;
        for (int ar : arr) {
            int minChaper = 1;
            int maxChapter = 0;
            maxChapter = ar < k ? maxChapter+ar : maxChapter+k;
            while (ar > 0) {
                pageNumber++;
                ar = ar - k;
                if (pageNumber <= maxChapter && pageNumber >= minChaper) {
                    specialProblem++;
                }
                minChaper +=k;
                maxChapter = ar < k ? maxChapter+ar : maxChapter+k;

            }
        }
        return specialProblem;
    }
    public static void main(String []arg) {
        List<Integer> arr = Arrays.asList(4, 2, 6, 1, 10);
        System.out.println(workbook(3, arr));
    }
}
