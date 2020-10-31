/*
 * Created on Apr 28, 2018
 */
package implementation;


public class SherlockAndArray {

    static String solve(int[] a){
        String result = "NO";
        int i =0; 
        int j = a.length-1;
        int left = a[i];
        int right = a[j];
        while(j>=i) {
            if(left > right) {
                j--;
                right += a[j];
            } else if(left < right) {
                i++;
                left += a[i];
            }else  {
                if(j-i == 2 || i == j) return "YES";                
                i++;j--;
                left += a[i];
                right += a[j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int T = in.nextInt();
        //for(int a0 = 0; a0 < T; a0++){
          //  int n = in.nextInt();
            int[] a = {1};
//            for(int a_i=0; a_i < n; a_i++){
//                a[a_i] = in.nextInt();
//            }
            String result = solve(a);
            System.out.println(result);
//        }
    }
}
