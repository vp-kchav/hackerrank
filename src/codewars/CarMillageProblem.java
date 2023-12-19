package codewars;

public class CarMillageProblem {
    public static int isInteresting(int number, int[] awesomePhrases) {
        for (int offSet = 0; offSet <= 2; offSet++) {
            int testNumber = number;
            testNumber += offSet;
            boolean isYellow = testNumber != number;
            int yellowOffset = 0;
            if (isYellow) {
                yellowOffset = 1;
            }
            //check three or more digit number
            boolean greaterThan99 = testNumber > 99;
            int[] numbers = Integer.toString(testNumber).chars().map(c -> c - '0').toArray();
            int zeroCounter = 0; //Any digit followed by all zeros: 100, 90000
            int identicalCounter = 0; // every digits has the same number
            int incrementingCounter = 0;
            int decrementingCounter = 0;
            int palindromeCounter = 0;
            boolean endsInZero = numbers[numbers.length - 1] == 0;
            for (int i = 0; i < numbers.length; i++) {
                //check digit followed by zeros
                if (numbers[i] == 0) {
                    zeroCounter++;
                }
                if (i + 1 < numbers.length) {
                    //check every digit is the same
                    if (numbers[i] == numbers[i + 1]) identicalCounter++;
                    //check ascending order
                    if (numbers[i + 1] - numbers[i] == 1) incrementingCounter++;
                    //check descending order
                    if (numbers[i] - numbers[i + 1] == 1) decrementingCounter++;
                }
            }
            if (greaterThan99) {
                //check awesomePhrases
                for (int phrase : awesomePhrases) {
                    if (phrase == testNumber) return 2 - yellowOffset;
                }
                //check palindrome
                int reversedIndex = numbers.length - 1;
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[reversedIndex] == numbers[i]) {
                        palindromeCounter++;
                    }
                    reversedIndex--;
                }
                if (zeroCounter == numbers.length - 1) return 2 - yellowOffset;
                if (identicalCounter == numbers.length - 1) return 2 - yellowOffset;
                if (incrementingCounter == numbers.length - 1) return 2 - yellowOffset;
                if (incrementingCounter == numbers.length - 2 && endsInZero) return 2 - yellowOffset;
                if (decrementingCounter == numbers.length - 1) return 2 - yellowOffset;
                if (decrementingCounter == numbers.length - 2 && endsInZero) return 2 - yellowOffset;
                if (palindromeCounter == numbers.length) return 2 - yellowOffset;
            }
        }
        return 0;
    }

    public static void main(String arg[]) {
      //  System.out.println(isInteresting(3, new int[]{1337, 256})); //0
        System.out.println(isInteresting(1336, new int[]{1337, 256}));//1
        System.out.println(isInteresting(1337, new int[]{1337, 256}));//2
        System.out.println(isInteresting(11208, new int[]{1337, 256})); //0
        System.out.println(isInteresting(11209, new int[]{1337, 256})); //1
        System.out.println(isInteresting(11211, new int[]{1337, 256})); //2
    }

}
