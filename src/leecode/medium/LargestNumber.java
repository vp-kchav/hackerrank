/*
 * Created on Feb 23, 2018
 */
package leecode.medium;

public class LargestNumber {

    public String largestNumber(int[] nums) {
        StringBuilder result = new StringBuilder();
        int index=0;
        for(int i=0; i<nums.length;i++) {
            index= getIndexBigestNumber(nums);
            result.append(nums[index]);
            nums[index] = 0;
        }
        return result.toString();
    }

    public int getIndexBigestNumber(int[] nums) {
        int max = nums[0];
        int maxIdex = 0;
        for(int j=1;j<nums.length-1;j++) {
            if(String.valueOf(max).length() == String.valueOf(nums[j]).length()) {
                if(max < nums[j]) {
                    max= nums[j];
                    maxIdex=j;
                }               
            }else {
                
            }
            
        }
        return maxIdex;
    }

    public static void main(String arg[]) {
//        String a ="80";
//        String b="9";
//        System.out.println(a.compareTo(b));
        System.out.println(16%4);
        System.out.println(4%16);
    }

}
