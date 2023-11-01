package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //Time complexity O(n2)
    private static int[] findTwoSum_BruteForce(int[] nums, int target) {
        int []result = new int[2];
        for(int i = 0; i<nums.length-1; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    // Time complexity: O(n)
    private static int[] findTwoSum(int[] nums, int target) {
        int []result = new int[2];
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i =0; i<nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                result[0] = numMap.get(complement);
                result[1] = i;
            } else {
                numMap.put(nums[i], i);
            }
        }
        return result;
    }
    // Time complexity: O(n*log(n))
    // Only work if we need to return the value instead of their indexes
    private static int[] findTwoSum_Sorting(int[] nums, int target) {
        Arrays.sort(nums);
        int []result = new int[2];
        int left = 0;
        int right = nums.length-1;
        while (left < right){
            if(nums[left] + nums[right] == target) {
                result[0] = nums[left];
                result[1] = nums[right];
                return result;
            } else if(nums[left] + nums[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }

    public static void main(String arg[]) {
        int aray[] = {2, 7, 11, 15};
        int[] result = findTwoSum_BruteForce(aray, 9);
        int[] result1 = findTwoSum(aray, 9);
        int[] result2 = findTwoSum_BruteForce(aray, 9);
        Arrays.stream(result).forEach(r -> System.out.print(r+" "));
        System.out.println();
        Arrays.stream(result1).forEach(r -> System.out.print(r+" "));
        System.out.println();
        Arrays.stream(result2).forEach(r -> System.out.print(r+" "));
    }
}
