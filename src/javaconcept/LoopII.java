package javaconcept;

import java.util.Scanner;

public class LoopII {

    public static void main(String []argh){
        int t=1;
        for(int i=0;i<t;i++){
            int a = 0;
            int b = 2;
            int n = 10;
            //for(int k=1; k<=t; k++) {
            String result = "";
            int cal = a;
            int sqrB = 1;
            for(int j=1;j<=n;j++) {
                cal += (sqrB * b);
                result += cal + " ";
                sqrB *= 2;
            }
            System.out.println(result.trim());
            //}
        }
    }
}
