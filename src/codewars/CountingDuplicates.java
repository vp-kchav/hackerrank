package codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        AtomicInteger count = new AtomicInteger();
        Map<Integer, Integer> existing = new HashMap<>();
        text.toLowerCase().chars().forEach(ch -> {
            if(existing.get(ch) == null) {
                existing.put(ch, 1);
            } else if(existing.get(ch) ==1) {
                existing.put(ch, 2);
                count.getAndIncrement();
            }
        });
        return count.get();
    }

    public static void main(String arg[]) {
        System.out.println(duplicateCount("aabbcde"));
        String numbers = "1 2 3 4 5";
        IntSummaryStatistics stats = Arrays.stream(numbers.split(" ")).mapToInt(Integer::valueOf).summaryStatistics();
        System.out.println(stats.getMax());
    }

}
