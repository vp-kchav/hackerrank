package leecode.easy;


import java.util.Arrays;

public class SortStringByLength {
    public static void main(String arg[]){
        String s = "No one could disentangle correctly";
        String[] arrS = s.split(" ");
        Arrays.sort(arrS, (a,b) -> Integer.compare(b.length(), a.length()));
        //System.out.println(arrS.);
        Arrays.stream(arrS).forEach(String::toString);

        //-----

        //System.out.println(missingNumberMe(new int[]{9,0,7,6,1,2,3,4,5,8,10,14 ,11, 12}));
        System.out.println(missingNumber(new int[]{0,1,3,2,4,5}));
    }

    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int[] temp = new int[len+1];
        for(int i=0; i<len; i++){
            temp[nums[i]]++;
        }
        for(int i=0; i<len; i++){
            if(temp[i]==0)
                return i;
        }
        return len;
    }

    public static int missingNumberMe(int[] nums) {
       Arrays.sort(nums);
       for(int i = 0; i<nums.length; i++) {
           if(nums[i]+1 != nums[i+1]) return nums[i]+1;
       }
       return -1;
    }

}
