package problemsolving;

/**
 * You are given a string containing characters  and  only. Your task is to change it into a string such that there are no matching adjacent characters. To do this, you are allowed to delete zero or more characters in the string.
 *
 * Your task is to find the minimum number of required deletions.
 *
 * Example
 *
 * Remove an  at positions  and  to make  in  deletions.
 */
public class AlternatingCharacter {

    public static int alternatingCharacters(String s) {
        int delete = 0;
        char com = s.charAt(0);
        for(int i=1; i<s.length();i++){
            if(com == s.charAt(i)) {
                delete++;
            } else {
                com = s.charAt(i);
            }
        }
        return delete;
    }

    public static void main(String arg[]) {
        System.out.println(alternatingCharacters("BBBB"));
        System.out.println(alternatingCharacters("AAABBB"));
        System.out.println(alternatingCharacters("ABABABAB"));

    }
}
