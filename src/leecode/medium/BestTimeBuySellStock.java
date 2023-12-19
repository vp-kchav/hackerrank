package leecode.medium;

import com.sun.xml.internal.ws.client.ClientSchemaValidationTube;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in
 * the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * Example 1:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you
 * sell.
 * Example 2:
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 */
public class BestTimeBuySellStock {

    public static int calProfit(int[] arr) {
        int prof = 0;
        for(int i=0; i<arr.length-1;i++) {
            for(int j=i+1; j<arr.length;j++){
                prof = Math.max(prof, arr[j]-arr[i]);
            }
        }
        return prof;
    }

    public static int calProfitBetter(int[] arr) {
        int currmax = 0;
        int max = 0;
        for(int i=1; i<arr.length; i++){
            currmax=Math.max(0, currmax= currmax + arr[i]-arr[i-1]);
            max=Math.max(currmax,max);
        }
        return max;
    }

    public static int calProfitPattII(int[] arr) {
        int prof = 0;
        for(int i=1; i<arr.length;i++) {
            //if(arr[i] > arr[i-1]) prof += (arr[i] - arr[i-1]);
            prof += Math.max(0, (arr[i] - arr[i-1]));
        }
        return prof;
    }

    public static List<Integer>  calProfitPattIII(int[] arr) {
        List<Integer> sales = new ArrayList<>();
        //int prof = 0;
        //int maxProf = 0;
//        int buy=arr[0];
//        for(int i=1; i<arr.length;i++) {
//            if(arr[i] < arr[i-1]) {
//                sales.add(arr[i-1] - buy);
//                buy = arr[i];
//            }
//        }

        int buy=arr[0];
        for(int i=0; i<arr.length;i++) {
            if(arr[i] > arr[Math.max(0,i-1)]) {
                if(arr[i] >= arr[Math.min(i+1,arr.length-1)]) {
                    sales.add(arr[i] - buy);
                    buy = arr[Math.min(i+1,arr.length-1)];
                }
            }
            buy = Math.min(buy,arr[i]);
        }
        return sales;
    }

    public static void main(String []arg) {
        int arr1[] = {7,1,5,3,6,4};
        int arr2[] = {7,6,5,4,3};
        System.out.println(calProfitBetter(arr1));
        System.out.println(calProfitBetter(arr2));
        System.out.println("----");
        int arr3[] ={1,2,3,4,5};
        System.out.println(calProfitPattII(arr1));
        System.out.println(calProfitBetter(arr3));
        System.out.println("----");
        int arr4[] = {3,3,5,0,0,3,1,4};
        //int arr5[] = {3,3,5,7,0,0,3,1,4,3,5,1,9,5,9,10,8,6,10};
        int arr5[] = {5,9,10,8,6,10};
        //System.out.println(calProfitPattIII(arr4));
        System.out.println(calProfitPattIII(arr5));
    }
}
