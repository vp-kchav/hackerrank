/*
 * Created on Dec 25, 2017
 */
package implementation;

import java.util.Scanner;

public class GradeStudent {
    
    static int[] solve(int[] grades){
        int[] result = new int[grades.length] ;
        for(int i = 0; i < grades.length; i++) {
            int number = grades[i];
            if( number >= 38 && getNextMultipleFive(number) - number < 3) {
                result[i] = getNextMultipleFive(number);
            } else {
                result[i] = number;
            }
        }
        return result;
    }

    static int getNextMultipleFive(int n) {
        int r = n/5;
        return (r + 1 )* 5;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }

}
