package October;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		for(int i = 0; i<number;i++) {
			for(int j=0; j<number;j++) {
				if(i+j >= number-1) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
