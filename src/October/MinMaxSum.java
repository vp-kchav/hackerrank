package October;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MinMaxSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        
//        int sum = 0;
//        for(int arr_i=0; arr_i < 5; arr_i++){
//            arr[arr_i] = in.nextInt();
//            sum+= arr[arr_i];
//        }
//        int min = arr[0];
//        int max = arr[0];
//        for(int i =1; i<arr.length;i++) {
//        	if(min > arr[i]) min = arr[i];
//        	if(max < arr[i]) max = arr[i];
//        }
//        System.out.println((sum - max) + " " + (sum - min));
        long max, min, sum;
        sum = max = min = in.nextLong();

        for(int i=1; i<5;i++){
            long temp = in.nextLong();
            sum += temp;
            if(max>temp){
                if(min > temp) {
                    min = temp;
                }
            } else {
                max = temp;
            }
        }

        System.out.print((sum -max) + " " + (sum - min));
	}

}
