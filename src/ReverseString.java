import javax.print.DocFlavor;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class ReverseString {
    private static String reverseString(String str) {
        String result = "";
        StringBuilder builder = new StringBuilder(str);
        String[] splitedStr = str.split("\\.");
        String reverse = builder.reverse().toString().replace(".","");
        int startIndex = 0;
        int lastIndex = 0;
        for (int i=0; i<splitedStr.length; i++) {
            lastIndex += splitedStr[i].length();
            result += reverse.substring(startIndex, lastIndex) + ".";
            startIndex = lastIndex;
        }
        return result.substring(0, result.length()-1);
    }

    private static String reverseStringLoop(String str) {
        String result = "";
        String reverseStr = new StringBuilder(str).reverse().toString().replace(".","");

        int index=0;
        for(int i =0; i<str.length(); i++) {
            if(Character.compare(str.charAt(i), '.')  != 0) {
                result += reverseStr.charAt(index);
                index++;
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String []arg) {
        String digitString = "345679.12";
        String digitString2 = "345679.12.41.12345.2345";
        System.out.println(reverseString(digitString));
        System.out.println(reverseString(digitString2));

        System.out.println(reverseStringLoop(digitString));
        System.out.println(reverseStringLoop(digitString2));

        String s =FileSystems.getDefault().getPath("/../foo/../sy/../dhe/").normalize().toString();
        System.out.println(s);
        List<String> me = new ArrayList<>();
        me.add("dff");
        me.add("sdfsd");
        me.add("sd");
        Stack<String> stack = new Stack();
        stack.push("a");stack.push("b");stack.push("c");
        String m = "/" + String.join("/",stack);
        System.out.println(m);
    }
}
