/*
 * Created on Feb 24, 2018
 */
package leecode.easy;

public class SetMismatch {

    //not completed yet
    public static int[] findErrorNums(int[] nums) {
        int result[] = new int[2];
        int number = 1;
        if(nums[0] >= nums[1] && nums[1] >1) number = -1;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i] == nums[i+1]) {
                result[0] = nums[i];
                result[1] = nums[i]+number;
            }
        }
        return result;
    }

    public static void main(String arg[]) {
        int []nums = {2,2}; 
        int result[] = findErrorNums(nums);
        for(int i: result) {
            System.out.println(i);
        }
    }
}
