package intuit;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Given a Natural number N > 0 find all its factors that are prime numbers
public class PrimeDivision {
    public static Set<Integer> getPrimeDivisors(int n) {
        Set<Integer> primeDivisors = new HashSet<>();
        // Eliminate all even divisors in one go
        while (n % 2 == 0) {
            primeDivisors.add(2);
            n /= 2;
        }

        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // Eliminate all divisors that are multiples of i
            while (n % i == 0) {
                primeDivisors.add(i);
                n = n/i;
            }
        }

        // This condition is to handle the case when
        // n is a prime number
        if (n != 1)
            primeDivisors.add(n);
        return primeDivisors;
    }

    public static Set<Integer> getPrimeDevision(int n) {
        Set<Integer> primeDevision = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                primeDevision.add(i);
                n = n/i;
            }
        }
        return primeDevision;
    }

    public static void printPrimeDivisors(int n) {
        System.out.println(String.format("prime factors of %s: %s",n, getPrimeDivisors(n)));
    }


    // Driver Code
    public static void main(String[] args) {
        // Initilaize scanner object to capture user input argument
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printPrimeDivisors(n);;
        System.out.println(getPrimeDevision(n));
    }
}
