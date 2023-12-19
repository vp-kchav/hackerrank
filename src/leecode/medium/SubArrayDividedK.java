package leecode.medium;

public class SubArrayDividedK {
    public static int subarraysDivByK(int[] A, int k) {
        int count=0;
        int sum =0;
        for (int i=0; i<A.length-1; i++) {
            sum += A[i];
            if(sum % k==0) count++;
            for(int j=i+1; j<A.length;j++){
                sum += A[j];
                if(sum % k==0) count++;
            }
            sum = 0;
        }
        return count;
    }

    public static int subarraysDivByKBetter(int[] A, int K) {
        int[] map = new int[K];
        map[0] = 1;
        int count = 0, sum = 0;
        for(int a : A) {
            sum = (sum + a) % K;
            if(sum < 0) sum += K;
            count += map[sum];
            map[sum]++;
        }
        return count;
    }

    public static void main(String arg[]) {
        int[] arr = {4,5,0,-2,-3,1};
        System.out.println(subarraysDivByK(arr,5));
        System.out.println(subarraysDivByKBetter(arr,5));
        //System.out.println(0%5);
    }
}
