package interview.visa;

import java.util.ArrayList;
import java.util.List;

public class FlowerBouquets {
    public static int findMaxProfit(List<int[]> jobs) {
        List<Integer> tabulation = new ArrayList<>();
        for (int i = 0; i < jobs.size(); i++) {
            tabulation.add(jobs.get(i)[2]);
        }
        for (int i = 0; i < jobs.size(); i++) {
            for (int j = i + 1; j < jobs.size(); j++) {
                if (jobs.get(i)[1] < jobs.get(j)[0]) {
                    tabulation.set(j, Math.max(tabulation.get(j), jobs.get(j)[2] + tabulation.get(i)));
                }
            }
        }
        return tabulation.get(tabulation.size() - 1);
    }

    public static int flowerBouquets(int p, int q, String s) {
        if (s.length() <= 1) {
            return 0;
        }
        List<int[]> jobs = new ArrayList<>();
        String type1 = "000";
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 3).equals(type1)) {
                jobs.add(new int[]{i, i + 2, p});
            } else {
                String cur = s.substring(i, i + 2);
                if (cur.equals("01") || cur.equals("10")) {
                    jobs.add(new int[]{i, i + 1, q});
                }
            }
        }
        if (jobs.isEmpty()) {
            return 0;
        }
        return findMaxProfit(jobs);
    }

    public static void main(String[] args) {
        int p = 1;
        int q = 2;
        String s = "010101";
        int result = flowerBouquets(p, q, s);
        System.out.println(result);
    }
}
