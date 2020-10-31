package sis;

public class Test1 {
	public static void main(String []arg) {
//		String a = "ab";
//		String b = new String("ab");
//		String c = a;
//		System.out.println(a==b);
//		System.out.println(a==c);
//		System.out.println(b.equals(c));
		int s = solution1(32);
		System.out.println(s);
		if(s > 999999) {
			s = s%1000000;
		}
		System.out.println(s);
//		int[]a = {5,4,0,3,1,6,2};
//		System.out.println(solution(a));
	}
	
	public static int solution(int[] A) {
        if(A.length ==0 || A == null) {
        	return 0; 
        }
        int max=0;
        for(int i = 0 ;i< A.length-1; i++) {
        	if(A[i] > A[i+1]) {
        		int diff = A[i] - A[i+1];
        		if(diff > max) max= diff;
        	}
        	//int diff = Math.abs(A[i] - A[i+1]);
        }
		return max;
        
    }
	
	public static int solution1(int N) {
		int f = fibonacci(N);
		return f;
    }
	
	public static  int fibonacci(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
