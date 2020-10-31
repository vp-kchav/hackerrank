package job;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution("Sat", 2);
//		int a[] = {1,2,0,-3,5};
//		System.out.println(solution(a));
	}
	
	public static String solution(String S, int K) {
		String dayOfWeeks[] = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		int currentIndex = findIndex(dayOfWeeks, S);
		int index= currentIndex+K;
		int day=index%7;
		return dayOfWeeks[day];
        // write your code in Java SE 8
    }
	
	public static int findIndex(String[] arr, String item) {
        for (int i=0;i<arr.length;i++) {
           if (item.equals(arr[i])) {
              return i;
           }
        }
        return -1;
     }

	public static int solution(int[] A) {
		int result = 1; 
		for(int n:A) {
			result *= n;
		}
		if(result > 0) return 1; 
		if(result < 0) return -1; 
		return result;
    }
}
