package problemsolving;

public class SeparateTheNumber {

    public static void separateNumbers(String s) {
        String substr = "";
        boolean isValid = false;
        // Iterate up to half the length of the string
        for (int i = 1; i <= s.length() / 2; i++) {
            substr = s.substring(0, i);
            Long num = Long.valueOf(substr);
            String validString = substr;

            while (validString.length() < s.length()) {
                validString += Long.toString(++num);
            }

            if (s.equals(validString)) {
                isValid = true;
                break;
            }
        }
        if(isValid){
            System.out.println("YES " + substr);
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String []arg) {
        String[] strs = {"1234", "91011", "99100", "101103","99910001001","7891011","9899100","999100010001"};
        for(String s : strs) {
            separateNumbers(s);
        }
        separateNumbers("999100010001");

    }
}
