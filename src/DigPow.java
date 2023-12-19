import java.util.ArrayList;
import java.util.List;

public class DigPow {
    public static long digPow(int n, int p) {
        // your code
        List<Integer> numbers = new ArrayList<>();
        int number = n;
        while(n > 0) {
            numbers.add(n%10);
            n = n/10;
        }
        int sum=0;
        for (int i = numbers.size()-1; i>=0; i--) {
            sum = sum + (int)Math.pow(numbers.get(i), p);
            p++;
        }
        if(sum % number == 0) return sum/number;
        return -1;
    }

    public static void main(String arg[]) {
        long d = digPow(1,100);
        System.out.println(d);
    }
}
