package job;

public class TestJob {
    public static void main(String arg[]) {
        String abc= "abc123@gmail.com";
        StringBuilder builder = new StringBuilder();
        builder.append(abc);
        builder.reverse();
        System.out.println(builder.toString());

        System.out.println(Integer.parseInt("0101010101",2));
        System.out.println(Integer.toBinaryString(17));

        int i = 0;
        int n=17;
        int []binaryNum = new int[1000];
        while (n > 0)
        {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
    }
}
