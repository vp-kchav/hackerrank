package October;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number  = scanner.nextInt();
		int[] value = new int[number];
		float plus=0, minus=0,zero=0 ;
		for(int i = 0; i<number ; i++) {
			value[i] = scanner.nextInt();
			if(value[i] > 0) {
				plus+=1;
			} else if(value[i] < 0) {
				minus +=1;
			}else {
				zero +=1;
			}
		}
		System.out.println(plus/number);
		System.out.println(minus/number);
		System.out.println(zero/number);

	}

}
