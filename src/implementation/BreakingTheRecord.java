/*
 * Created on Feb 1, 2018
 */
package implementation;

import java.util.Scanner;

public class BreakingTheRecord {
    
    static int[] breakingRecords(int[] score) {
        int[] result = new int[2];
        int countMin=0, countMax=0;
        int min = score[0], max =score[0];
        for(int i = 1; i < score.length;i++) {
            if(score[i] > max) {
                countMax++;
                max= score[i];
            }else if(score[i] < min) {
                countMin++;
                min = score[i];
            }
            
        }
        result[0]=countMax;
        result[1] = countMin;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
