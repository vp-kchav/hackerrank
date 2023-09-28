package intuit;

public class LongSequential {

    public static void main(String arg[]) {
        int arr[] = {0, 23, 1, 0, 4, 8, 99, 100, 122};
        System.out.println(findLongestSequential(arr));
    }

    public static int findLongestSequential(int []array) {
        int longestS = 1;
        int currentS = 1;
        for (int i = 0; i<array.length-1; i++) {
            if (array[i] < array[i+1]) {
                currentS += 1;
                if (currentS > longestS) longestS = currentS;
            } else {
                currentS = 1;
            }
        }
        return longestS;
    }

}
