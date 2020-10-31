package dynamicprogramming;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Candies {

    // Complete the candies function below.
    static long candiesGive(int length, int[] arr) {
//        long sum = 0;
//        int last = 0;
//        int c = 0; int score = -1;
//        for(int i = 0; i<n; i++) {
//            if(arr[i] > score){
//                c++;
//            } else {
//                c=1;
//                for(int j=i; j<n-1; j++){
//                    if(arr[j] > arr[j+1]) {
//                        if(last == 1){
//                            c=1;
//                            break;
//                        }
//                        c++;
//                        if(last == c) c--;
//                    } else {
//                        break;
//                    }
//                }
//            }
//            System.out.print(c);
//            score=arr[i];
//            sum += c;
//            last = c;
//        }
//        return sum;

        int[] candies = new int[length];
        candies[0] = 1;
        // search forward sequences
        for (int i = 1; i < length; i++){
            //children[i] = arr[i];
            candies[i] = 1;
            if (arr[i] > arr[i - 1])
                candies[i] = candies[i - 1] + 1;
        }
        // search reverse sequences
        for (int i = length - 1; i > 0; i--){
            if (arr[i] < arr[i - 1])
                candies[i - 1] = Math.max(candies[i - 1], candies[i] + 1);
        }
        long sum = 0;
        for (int i= 0; i < candies.length; i++){
            sum += candies[i];
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
       //int[] arr = {2,4 ,3 ,5 ,2 ,6,4 ,5};
       //int n = 8;
        int[] arr = {2 ,4 ,2 ,6 ,1 ,7 ,8 ,9 ,7,6,7,8,9 ,4};
       long number = candiesGive(14,arr);
        System.out.println("   ");
        System.out.println(number);
    }
}
