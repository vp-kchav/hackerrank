package codewars;


public class DescendingOrder {
    public static int sortDesc(final int num) {
        int sortedNumber =0;
        for(int i=9; i>=0; i--) {
            int tmpNumber=num;
            while (tmpNumber >0) {
                int digit = tmpNumber %10;
                if(digit == i) {
                    sortedNumber = sortedNumber * 10;
                    sortedNumber += digit;
                }
                tmpNumber = tmpNumber/10;
            }
        }
        return sortedNumber;

        /*
        return Integer.parseInt(String.valueOf(num)
                                      .chars()
                                      .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                                      .sorted(Comparator.reverseOrder())
                                      .collect(Collectors.joining()));
         */
    }

    public static void main(String []arg) {
        System.out.println(sortDesc(15));
        System.out.println(sortDesc(123456789));
    }
}
