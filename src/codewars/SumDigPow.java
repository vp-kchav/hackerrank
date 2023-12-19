package codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class SumDigPow {
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> result = new ArrayList<>();
        for(long i = a; i < b; i++) {
            long tmpNumber = i;
            long sum = 0;
            List<Long> reverse = new ArrayList<>();
            while(tmpNumber > 0) {
                //sum += Math.pow(i, counter);
                reverse.add(tmpNumber%10);
                tmpNumber = tmpNumber/10;
            }
            int counter =0;
            for(int r=0; r<reverse.size();r++) {
                sum += Math.pow(reverse.get(r), reverse.size()-counter);
                counter++;
            }
            if(sum == i) {
                result.add(i);
            }
        }
        return result;
    }

    public static List<Long> sumDigPowAsChar(long a, long b) {
        List<Long> result = new ArrayList<>();
        for(long i = a; i < b; i++) {
            long sum = 0;
            long tmpNumber = i;
            String number = Long.toString(i);
            for (int j = 0; j<number.length(); j++) {
                sum += Math.pow(Character.getNumericValue(number.charAt(j)), j+1);
            }
            if(sum == i) {
                result.add(i);
            }
        }
        return result;
    }


     public static List<Long> sumDigPowAsStream(long a, long b) {
        return LongStream.rangeClosed(a, b)
          .filter(i -> isValid(i))
          .boxed()
          .collect(Collectors.toList());
    }

    private static boolean isValid(long x){
      String value = Long.toString(x);
      return IntStream.range(0, value.length())
         .mapToDouble(i -> Math.pow(Character.getNumericValue(value.charAt(i)), i + 1))
         .sum() == x;
    }


    public static void main(String arg[]) {
        System.out.println(sumDigPowAsChar(89,100));
        System.out.println(sumDigPow(89,100));
        System.out.println(sumDigPowAsStream(89,100));
    }
}
