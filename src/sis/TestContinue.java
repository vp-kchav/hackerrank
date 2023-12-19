package sis;

/**
 * count number from array and if the index is even plus another 10
 */
public class TestContinue {
    public static void main(String arg[]) {
        int[] number={1,2,3,4,5};
        int sum=0;
        for (int i=0; i<number.length; i++) {
            sum += number[i];
            if(i%2==0) {
                continue;
            }
            sum+=10;
        }
        System.out.println(sum);
    }
}
