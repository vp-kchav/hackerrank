package intuit;
// Software Engineer 1, Software Engineer 2 and Senior Software Engineer

/**
 * A happy number is number that eventually leads to 1 after a sequences of steps.
 *
 *  * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 *  * Repeat the process until the number either equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 */
public class HappyNumber {
    public static void main(String [ ] args) {
//        List<Integer> input = new ArrayList<>();
//
//        input.add(7);
//        input.add(105);
//        input.add(13);
//        input.add(1);
//        input.add(4);
//        input.add(0);
//        input.add(-2);
//        input.add(784);
        int[] input = {4,5,6,7,8,9};
        for(Integer i : input) {
            if (isHappy(i)) {
                System.out.println(i + ",");
            }
        }
        System.out.println("---------");
        for(Integer i : input) {
            if (isHappyChar(i)) {
                System.out.println(i + ",");
            }
        }
    }

    public static int happify(int n) {
        int sum = 0;
        while (n > 0) {
            sum += sqr(n % 10);
            n /= 10;
        }
        return sum;
    }

    public static int happifyChar(int n) {
        int sum = 0;
        String number = String.valueOf(n);
        for(int i=0; i<number.chars().count(); i++) {
            sum += sqr(Character.getNumericValue(number.charAt(i)));
        }
//        while (n > 0) {
//            String.valueOf(n).chars().forEach();
//            sum += sqr(n % 10);
//            n /= 10;
//        }
        return sum;
    }

    public static int sqr(int n) {
        return (n * n);
    }

    public static boolean isHappy(int n) {
        if (n == 1) {
            return true;
        } else if (n==4 || n == 0){
            return false;
        } else {
            return isHappy(happify(n));
        }
    }

    public static boolean isHappyChar(int n) {
        if (n == 1) {
            return true;
        } else if (n==4 || n == 0){
            return false;
        } else {
            return isHappyChar(happifyChar(n));
        }
    }
}
