package leecode.easy;

public class ReverseIP3 {
    public static void main(String arg[]) {
        System.out.println(Math.abs(3-20));
        int result = 0;
        for(int a = 20; a<23;a++) {
            System.out.println(a);
            StringBuilder builder = new StringBuilder();
            builder.append(a);
            int reverse = Integer.valueOf(builder.reverse().toString());
            System.out.println("reverse: " + reverse);
            if(Math.abs(a-reverse) % 6 == 0) result++;
            System.out.println(builder);
        }
//        return result;
    }
}
