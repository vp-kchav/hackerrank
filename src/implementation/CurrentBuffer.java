/*
 * Created on Apr 11, 2018
 */
package implementation;

public class CurrentBuffer {
    static String appendAndDelete(String s, String t, int k) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        int count =0;
        int loopCount = charS.length;
        if(charS.length + charT.length <= k) {
            return "Yes";
        }
        if(charT.length < loopCount) loopCount = charT.length;
        for(int i= 1; i<=loopCount;i++) {
            if(charS[i-1] != charT[i-1]) break;
            count++;
        }
        int numberPlus = (charS.length - count)+(charT.length - count);
        int Somnorl = k - numberPlus;
        
       
        if( numberPlus == k) {
            return "Yes";
        }else if(numberPlus< k) {
            if(Somnorl %2==0) {
                return "Yes";
            }
        }
        return "No";
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s = "abcd";//in.next();
//        String t = "abcdert";//in.next();
//        int k = 10;//in.nextInt();
//        String result = appendAndDelete(s, t, k);
//        System.out.println(result);
//        in.close();
        int i = (int)Math.sqrt(10);
        int j = (int) Math.pow(1,2);
        System.out.println(i);
    }
}
