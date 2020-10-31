/*
 * Created on Feb 25, 2018
 */
package implementation;

public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        int result =0;
        for(int i =0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(ar[i] == 0) break;
                if (ar[i] == ar[j]) {
                    result++;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return result;        
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] ar = new int[n];
//        for(int ar_i = 0; ar_i < n; ar_i++){
//            ar[ar_i] = in.nextInt();
//        }
        int n=15;
        int ar[] = {6,5,2,3,5,2,2,1,1,5,1,3,3,3,5};
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }

}
