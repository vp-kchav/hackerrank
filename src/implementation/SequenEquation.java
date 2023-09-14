package implementation;

import java.io.IOException;
import java.util.Scanner;

public class SequenEquation {
	// Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
    	int[] result = new int[p.length];
        for(int i=1; i<=p.length;i++) {
            int index = findIndexOfArray(p,i);
            int index2 = findIndexOfArray(p,index);;
            result[i-1] = index2;
        }
    	return result;
    }

    static int findIndexOfArray(int[] p,int number) {
        for(int i=0;i<p.length;i++) {
            if(p[i]==number) return i+=1;
        }
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);



        for (int i = 0; i < result.length; i++) {
           System.out.println(result[i]);
        }

        scanner.close();
    }

}
