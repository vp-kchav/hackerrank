/*
 * Created on Nov 5, 2018
 */
package implementation;

import java.io.IOException;

public class RepeatedString {

    public static long countString(String s, long n) {
        long m = n/s.length();
        long mo = n%s.length();
        //long ns = s.toCharArray().to .count("a") * mo + s.substring(0,n-1).count("a");
        long c = s.chars().filter(ch -> ch=='a').count();//Stream.of(s.split("")).filter(ch -> ch=="a").count();
        long c1= s.substring(0,(int) (mo)).chars().filter(ch -> ch=='a').count();
        return c*m + c1;
    }
    

    public static void main(String[] args) throws IOException {



        long result = countString("aba",10);
       System.out.println(result);
    }
}
