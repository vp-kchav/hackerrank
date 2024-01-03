package problemsolving;

/**
 * James found a love letter that his friend Harry has written to his girlfriend. James is a prankster, so he decides to meddle with the letter. He changes all the words in the letter into palindromes.
 *
 * To do this, he follows two rules:
 *
 * He can only reduce the value of a letter by , i.e. he can change d to c, but he cannot change c to d or d to b.
 * The letter  may not be reduced any further.
 * Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations required to convert a given string into a palindrome.
 *
 * The following two operations are performed: cde → cdd → cdc. Return .2
 */
public class LoveLetterMystery {

    public static int theLoveLetterMystery(String s) {
        int sum = 0;
        for(int i=0; i<s.length()/2; i++) {
            int first = s.charAt(i);//abc.indexOf(s.charAt(i));
            int second = s.charAt(s.length()-1-i);//abc.indexOf(s.charAt(s.length()-1-i));
            sum += Math.abs(first - second);
        }
        return sum;
    }


    public static void main(String arg[]) {
        System.out.println(theLoveLetterMystery("adslkfjas"));
    }
}
