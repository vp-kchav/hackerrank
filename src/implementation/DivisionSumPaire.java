/*
 * Created on Feb 24, 2018
 */
package implementation;

public class DivisionSumPaire {
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int number =0;
        for(int i=0;i<n - 1;i++) {
            for(int j=i+1;j<n;j++) {
                int sum =ar[i] + ar[j];
                if(sum % k == 0) {
                    number++;
                }
            }
        }
        return number;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int k = in.nextInt();
//        int[] ar = new int[n];
//        for(int ar_i = 0; ar_i < n; ar_i++){
//            ar[ar_i] = in.nextInt();
//        }
        int n = 100;
        int k=22;
        int[] ar = {43,95,51,55,40,86,65,81,51,20,47,50,65,53,23,78,75,75,47,73,25,27,14,8,26,58,95,28,3,23,48,69,26,3,73,52,34,7,40,33,56,98,71,29,70,71,28,12,18,49,19,25,2,18,15,41,51,42,46,19,98,56,54,98,72,25,16,49,34,99,48,93,64,44,50,91,44,17,63,27,3,65,75,19,68,30,43,37,72,54,82,92,37,52,72,62,3,88,82,71};
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}
