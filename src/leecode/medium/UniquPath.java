package leecode.medium;

public class UniquPath {
    public static int uniquePaths(int m, int n) {
        if(m == 1 || n == 1)
            return 1;
        m--;
        n--;
        if(m < n) { // Swap, so that m is the bigger number
            m = m + n;
            n = m - n;
            m = m - n;
        }
        long res = 1;
        int j = 1;
        for(int i = m+1; i <= m+n; i++, j++){ // Instead of taking factorial, keep on multiply & divide
            res *= i;
            res /= j;
        }
        return (int)res;
    }

    public static int uniquePathShort(int m, int n) {
        int N = m + n -2;
        int r = m-1;
        double res=1;
        for(int i=1; i<=r; i++){
            res=res*(N-r+i)/i;
        }
        return (int)res;
    }

    public static void  main(String arg[]) {
        System.out.println(uniquePathShort(7,3));
    }
}
