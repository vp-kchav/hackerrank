package codewars;

import java.util.stream.Stream;

public class Rot13 {

    private static String rot13(String message) {
        String in = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String out = "NOPQRSTUVWXYZABCDEFGHIJKLMnopqrstuvwxyzabcdefghijklm";
        StringBuilder result = new StringBuilder();
        for (char ch : message.toCharArray()) {
            int index= in.indexOf(ch);
            if(index >= 0) {
                result.append(out.charAt(index));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main (String[] arg) {
        System.out.println(rot13("hello"));
        System.out.println(rot13("Hello World!"));
    }
}
