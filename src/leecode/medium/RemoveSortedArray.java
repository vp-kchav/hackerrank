package leecode.medium;

public class RemoveSortedArray {

    public static int removeDuplicates(int[] nums) {
        int result=1;
        int dup =1;
        for(int i=1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[result] = nums[i];
                result++;
                dup = 1;
            } else {
                if(dup <2) {
                    nums[result] = nums[i];
                    result++;
                    dup++;
                }
            }
        }
        return result;

    }

    public static void main(String arg[]) {
//        int []ar = {1,1,1,2,2,3};
//        removeDuplicates(ar);

        String a = "abc";
        String c = "abc";
        String d = a;
        String b = new String(a);
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a == c);
        System.out.println(a == d);

    }
}
