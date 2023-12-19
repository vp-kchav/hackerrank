package problemsolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * Reduce a string of lowercase characters in range ascii[‘a’..’z’]by doing a series of operations. In each operation, select a pair of adjacent letters that match, and delete them.
 *
 * Delete as many characters as possible using this method and return the resulting string. If the final string is empty, return Empty String
 *
 * Example.
 *
 *
 * aab shortens to b in one operation: remove the adjacent a characters.
 *
 *
 * Remove the two 'b' characters leaving 'aa'. Remove the two 'a' characters to leave ''. Return 'Empty String'.
 * Sample Input 0
 *
 * aaabccddd
 * Sample Output 0
 *
 * abd
 * Explanation 0
 *
 * Perform the following sequence of operations to get the final string:
 *
 * aaabccddd → abccddd → abddd → abd
 */
public class SuperReduceString {

    public static void main(String arg[]) {
        System.out.println(superReducedStringUsingStack("aaabccddd"));
        System.out.println(superReducedStringUsingStack("baab"));

        System.out.println(superReducedStringUsingBruteForce("aaabccddd"));
        System.out.println(superReducedStringUsingBruteForce("baab"));

    }

    public static String superReducedStringUsingStack(String s) {
        Stack<Character> myStack = new Stack<>();
        myStack.push(s.charAt(0));
        for(int i=1;i<s.length();i++) {
            if(!myStack.isEmpty() && myStack.peek() == s.charAt(i)) {
                myStack.pop();
            } else {
                myStack.push(s.charAt(i));
            }
        }
        return myStack.isEmpty()? "Empty String" : myStack.stream().map(st -> st.toString()).collect(Collectors.joining());
    }

    public static String superReducedStringUsingBruteForce(String s) {
        int n = s.length();
        do {
            for(int i=0; i<s.length()-1; i++) {
                if(s.charAt(i) == s.charAt(i+1)){
                    s = s.replace(s.charAt(i)+""+s.charAt(i),"");
                    break;
                }
            }
        } while (s.length() != n);

        return s.isEmpty()? "Empty String":s;
    }
}
