package codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EncryptionDecryption {
    public static String encrypt(final String text, final int n) {
        String tmpText = text;
        String odd = IntStream.range(0, text.length())
                .filter(i -> i%2 != 0)
                .mapToObj(i -> text.charAt(i))
                .map(Object::toString)
                .collect(Collectors.joining(""));

//        for(int i=0; i<n; i++) {
//            String odd="";
//            String even="";
//            for(int j = 1; j<tmpText.length(); j+=2) {
//                odd = odd.concat(String.valueOf(tmpText.charAt(j)));
//            }
//            for(int j = 0; j<tmpText.length(); j+=2) {
//                even = even.concat(String.valueOf(tmpText.charAt(j)));
//            }
//            tmpText = odd + even;
//        }
        return tmpText;
    }

    public static String decrypt(final String encryptedText, final int n) {
        String tmpText = encryptedText;
        for(int i=0; i<n; i++) {
            String oriText = "";
            //int mid = tmpText.length() %2 == 0 ? tmpText.length()/2 : (tmpText.length()/2) +1;
            int mid = tmpText.length() / 2;
            for(int j = mid;j<tmpText.length(); j++) {
                oriText = oriText.concat(String.valueOf(tmpText.charAt(j)));
                if(j - mid != mid) oriText = oriText.concat(String.valueOf(tmpText.charAt(j-mid)));
            }
            tmpText = oriText;
        }
        return tmpText;
    }

    public static String encryptStream(final String text, final int n) {
        if(text == null || n < 1) return text;
        String first = IntStream.range(0, text.length())
                .filter(i -> i%2 == 1)
                .mapToObj(i -> text.charAt(i))
                .map(Object::toString)
                .collect(Collectors.joining(""));
        String second = IntStream.range(0, text.length())
                .filter(i -> i%2 == 0)
                .mapToObj(i -> text.charAt(i))
                .map(Object::toString)
                .collect(Collectors.joining(""));
        return encryptStream(first + second, n - 1);
    }


    public static String decryptStream(final String text, final int n) {
        if(text == null || n < 1) return text;
        String decrypted = IntStream.range(0, text.length())
                .mapToObj(i -> (i%2 == 1) ? text.charAt(i/2) : text.charAt(text.length()/2 + i/2))
                .map(Object::toString)
                .collect(Collectors.joining(""));
        return decryptStream(decrypted, n - 1);
    }

    public static void main(String arg[]) {

        System.out.println(encryptStream("This is a test!", 1));
        System.out.println(encryptStream("This is a test!", 2));
        System.out.println(encryptStream("This is a test!", 3));
        System.out.println(encryptStream("This is a test!", 4));
        System.out.println(encryptStream("This is a test!", -1));
        System.out.println(encryptStream("This kata is very interesting!", 1));

        System.out.println(encrypt("This is a test!", 0));
        System.out.println(encrypt("This is a test!", 1));
        System.out.println(encrypt("This is a test!", 2));
        System.out.println(encrypt("This is a test!", 3));
        System.out.println(encrypt("This is a test!", 4));
        System.out.println(encrypt("This is a test!", -1));
        System.out.println(encrypt("This kata is very interesting!", 1));
        /*
        assertEquals("This is a test!", Kata.encrypt("This is a test!", 0));
        assertEquals("hsi  etTi sats!", Kata.encrypt("This is a test!", 1));
        assertEquals("s eT ashi tist!", Kata.encrypt("This is a test!", 2));
        assertEquals(" Tah itse sits!", Kata.encrypt("This is a test!", 3));
        assertEquals("This is a test!", Kata.encrypt("This is a test!", 4));
        assertEquals("This is a test!", Kata.encrypt("This is a test!", -1));
        assertEquals("hskt svr neetn!Ti aai eyitrsig", Kata.encrypt("This kata is very interesting!", 1));
        */

        System.out.println("Decryption!!!");
        System.out.println(decrypt("This is a test!", 0));
        System.out.println(decrypt("hsi  etTi sats!", 1));
        System.out.println(decrypt("s eT ashi tist!", 2));
        System.out.println(decrypt(" Tah itse sits!", 3));
        System.out.println(decrypt("This is a test!", 4));
        System.out.println(decrypt("This is a test!", -1));
        System.out.println(decrypt("hskt svr neetn!Ti aai eyitrsig", 1));


        /*
        assertEquals("This is a test!", Kata.decrypt("This is a test!", 0));
        assertEquals("This is a test!", Kata.decrypt("hsi  etTi sats!", 1));
        assertEquals("This is a test!", Kata.decrypt("s eT ashi tist!", 2));
        assertEquals("This is a test!", Kata.decrypt(" Tah itse sits!", 3));
        assertEquals("This is a test!", Kata.decrypt("This is a test!", 4));
        assertEquals("This is a test!", Kata.decrypt("This is a test!", -1));
        assertEquals("This kata is very interesting!", Kata.decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
        */
    }
}
