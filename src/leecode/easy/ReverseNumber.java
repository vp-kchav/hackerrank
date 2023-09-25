/*
 * Created on Mar 26, 2018
 */
package leecode.easy;


public class ReverseNumber {
    
    public static int reverseRecursion(int x) {
      if(x < 10) {
          return x;
      }else {
          return x%10 *10 + reverseRecursion(x/10); 
      }
      
    }
    
    public int reverse(int x) {
        int reverseNumber = 0;
        while(x !=0 ) {
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + x % 10;
            x = x/10;
            if(reverseNumber > 2147483647) {
                return 0;
            }
        }
        return reverseNumber;
    }
    
    public static void main(String arg[]) {
//        System.out.println(reverse(123));
        int num=0;
        int reversenum =0;
//        System.out.println("Input your number and press enter: ");
        //This statement will capture the user input
//        Scanner in = new Scanner(System.in);
        //Captured input would be stored in number num
        num = 123;
        //While Loop: Logic to find out the reverse number
        reversenum = reverseRecursion(num);

        System.out.println("Reverse of input number is: "+reversenum);
    }

}
