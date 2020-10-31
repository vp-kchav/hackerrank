package October;

import java.util.Scanner;

public class Solution {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numbre = in.nextInt();
		int x1 =0;
		int x2 =0;
		int matrix[][] = new int[numbre][numbre];
		for(int i =0 ; i<numbre ; i++){
			for(int j=0; j<numbre ;j++) {
				matrix[i][j] = in.nextInt();
				if(i == j) {
					x1 += matrix[i][j];
				}
				if(i+j == numbre-1) {
					x2 += matrix[i][j];
				}
			}
		}
		
		System.out.println(Math.abs(x1-x2));	
	}

}
