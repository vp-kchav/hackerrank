package datastructure;

import java.io.IOException;
import java.util.Scanner;

public class Array2D {
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int maxSum = -10000000;

        for(int r=0; r <=arr.length - 3; r++) {
            for(int c= 0; c<=arr[r].length - 3; c++) {
                int sum = 0;
                sum = arr[r][c] + arr[r][c+1] + arr[r][c+2] +
                        arr[r+1][c+1] +
                      arr[r+2][c] + arr[r+2][c+1] + arr[r+2][c+2];
//                System.out.println(arr[r][c] +" "+ arr[r][c+1] +" "+ arr[r][c+2]);
//                System.out.println(arr[r+1][c+1]);
//                System.out.println(arr[r+2][c] +" "+ arr[r+2][c+1] +" "+ arr[r+2][c+2]);
//                System.out.println("*"+sum+"*");
//                System.out.println("-----------");
                if(sum > maxSum) maxSum = sum;
            }
        }
        return maxSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[][] arr = {
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0}
        };

//        int[][] arr = {
//                {1,2,3,4,5,6},
//                {1,2,3,4,5,6},
//                {1,2,3,4,5,6},
//                {1,2,3,4,5,6},
//                {1,2,3,4,5,6},
//                {1,2,3,4,5,6}
//        };

        int result = hourglassSum(arr);
        System.out.println(result);
    }
}
