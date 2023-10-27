package algorithm;

import java.util.Arrays;

public class HallowenSale {
    public static int howManyGames(int p, int d, int m, int s) {
        int games = 0;
        while(s >= p) {
            s = s - p;
            if ((p-d) <= m) {
                p = m;
            } else {
                p = p -d;
            }
            games++;
        }
        return games;
    }

    public static void main(String arg[]) {
        int re = howManyGames(20,3,6,85);
        System.out.println(re);
        int chocolate = 17 / 3;
        int nLeft = 17 % 3;
    }
}
