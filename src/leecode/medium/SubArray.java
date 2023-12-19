package leecode.medium;

/**
 Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest
 sum and return its sum.
 A subarray is a contiguous part of an array.

 Example 1:
 Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 Output: 6
 Explanation: [4,-1,2,1] has the largest sum = 6.
 Example 2:
 Input: nums = [1]
 Output: 1
 Example 3:
 Input: nums = [5,4,-1,7,8]
 Output: 23
 */
public class SubArray {
    public static int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum=Math.max(nums[i], nums[i]+sum);
            max=Math.max(sum,max);
        }
        return max;
    }

    public static void main(String arg[]) {
        int arr[] = {5,4,-1,7,-20,16,8};//{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
