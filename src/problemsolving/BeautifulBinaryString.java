package problemsolving;

/**
 * Alice has a binary string. She thinks a binary string is beautiful if and only if it doesn't contain the substring .
 *
 * In one step, Alice can change a  to a  or vice versa. Count and print the minimum number of steps needed to make Alice see the string as beautiful.
 *
 * Example
 *
 *
 * She can change any one element and have a beautiful string.
 */
public class BeautifulBinaryString {
    public static int beautifulBinaryString(String b) {
//        int count =0;
//        for(int i=0; i<b.length() -2; i++) {
//            //if(b.charAt(i) == '0' && b.charAt(i+1) == '1' && b.charAt(i+2) == '0') {
//            if(b.substring(i,i+3).equals("010")) {
//                i +=2;
//                count++;
//            }
//        }
//        return count;
        String c = b.replace("010", "");
        return (b.length() - c.length()) / 3;
    }

    public static void main(String arg[]) {
        System.out.println(beautifulBinaryString("0101010"));
        System.out.println(beautifulBinaryString("01100"));
        System.out.println(beautifulBinaryString("0100101010"));
    }
}
