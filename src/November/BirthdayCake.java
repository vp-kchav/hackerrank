package November;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BirthdayCake {

	static int birthdayCakeCandles(int n, int[] ar,int max) {
	
        //int count = (int) Arrays.asList(ar).stream().filter(x -> x.toString().equals(max)).count();
		int count = 0;
		for(int i=0;i<n;i++) {
			if(ar[i] == max) {
				count+=1;
			}
		}
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        int max = 0;
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
            if(ar[ar_i] > max) max = ar[ar_i];
        }
        int result = birthdayCakeCandles(n, ar,max);
        System.out.println(result);
    }

}
