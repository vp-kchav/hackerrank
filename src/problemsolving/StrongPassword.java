package problemsolving;

/**
 * Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a password. However, the password must be strong. The website considers a password to be strong if it satisfies the following criteria:
 *
 * Its length is at least .
 * It contains at least one digit.
 * It contains at least one lowercase English character.
 * It contains at least one uppercase English character.
 * It contains at least one special character. The special characters are: !@#$%^&*()-+
 * She typed a random string of length  in the password field but wasn't sure if it was strong. Given the string she typed, can you find the minimum number of characters she must add to make her password strong?
 *
 * Note: Here's the set of types of characters in a form you can paste in your solution:
 *
 * numbers = "0123456789"
 * lower_case = "abcdefghijklmnopqrstuvwxyz"
 * upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
 * special_characters = "!@#$%^&*()-+"
 *
 *
 */
public class StrongPassword {

    public static int minimumNumber(int n, String password) {
        final String  numbers = "0123456789";
        final String lower_case = "abcdefghijklmnopqrstuvwxyz";
        final String  upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String  special_characters = "!@#$%^&*()-+";
        boolean hasNumbers = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecialCharacter = false;
        int result = 0;
        char[] arr = password.toCharArray();
        for (char c : arr){
            String s = String.valueOf(c);
            if (!hasNumbers){
                if (numbers.contains(s)){
                    hasNumbers = true;
                    continue;
                }
            }

            if (!hasLowerCase){
                if (lower_case.contains(s)){
                    hasLowerCase = true;
                    continue;
                }
            }

            if (!hasUpperCase){
                if (upper_case.contains(s)){
                    hasUpperCase = true;
                    continue;
                }
            }

            if (!hasSpecialCharacter){
                if (special_characters.contains(s)){
                    hasSpecialCharacter = true;
                }
            }
        }

        if (!hasNumbers){
            result++;
        }
        if (!hasLowerCase){
            result++;
        }
        if (!hasUpperCase){
            result++;
        }
        if (!hasSpecialCharacter){
            result++;
        }
        return Math.max(result, 6-n);
    }

    public static void main(String arg[]) {
        System.out.println(minimumNumber(11, "#HackerRank"));
        System.out.println(minimumNumber(3,"3Ab"));

        System.out.println(minimumNumber( "#HackerRank"));
        System.out.println(minimumNumber( "#12HackerRank"));
        System.out.println(minimumNumber("3Ab"));
    }

    private static int minimumNumber(String str) {
        final String  numbers = "0123456789";
        final String lower_case = "abcdefghijklmnopqrstuvwxyz";
        final String  upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String  special_characters = "!@#$%^&*()-+";
        boolean hasNumber = false;
        boolean hasLowerCase = false;
        boolean hasUperCase = false;
        boolean hasSpecialCharactor = false;
        int result = 4;
        for(int i=0; i<str.length(); i++) {
            if(!hasNumber) {
                if(numbers.contains(String.valueOf(str.charAt(i)))){
                    hasNumber = true;
                    result--;
                    continue;
                }
            }
            if(!hasLowerCase) {
                if(lower_case.contains(String.valueOf(str.charAt(i)))){
                    hasLowerCase = true;
                    result--;
                    continue;
                }
            }
            if(!hasUperCase) {
                if(upper_case.contains(String.valueOf(str.charAt(i)))){
                    hasUperCase = true;
                    result--;
                    continue;
                }
            }
            if(!hasSpecialCharactor) {
                if(special_characters.contains(String.valueOf(str.charAt(i)))){
                    hasSpecialCharactor = true;
                    result--;
                }
            }
        }
        return Math.max(result, 6-str.length());
    }
}
