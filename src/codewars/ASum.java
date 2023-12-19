package codewars;

public class ASum {
    public static long findNb(long m) {
        long sum =0;
        int count =1;
        while(sum<=m) {
            sum += Math.pow(count,3);
            if(sum == m) return count;
            count++;
        }
        return -1;
    }

    public static void main(String arg[]) {
        System.out.println(findNb(2304422822859502500L));
    }
}
