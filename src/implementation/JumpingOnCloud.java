package implementation;

public class JumpingOnCloud {

	 static int jumpingOnClouds(int[] c) {
        int count = 0;
        for(int i = 0 ; i<c.length-1;++i) {
            if(i +2  <= c.length - 1){
                if(c[i+2] == 0) i++;
            }
            count++;
        }
        return count;
    }

	public static void main(String[] args) {
//		int c[] = {0,0,1,0,0,1,0};
		int c[] = {0,0,0,1,0,0};
		int j = jumpingOnClouds(c);
		System.out.println(j);
	}

}
