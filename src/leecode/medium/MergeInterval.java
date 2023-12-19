package leecode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 Merge Intervals
 Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and
 return an array of the non-overlapping intervals that cover all the intervals in the input.
 Example 1:
 Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 Output: [[1,6],[8,10],[15,18]]
 Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 Example 2:
 Input: intervals = [[1,4],[4,5]]
 Output: [[1,5]]
 Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */

public class MergeInterval {

    public static int[][] merge(int[][] intervals) {

        List<int[]> result = new ArrayList<>();
        if(intervals.length <=1) return intervals;
        //Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int[] interv : intervals) {
            if(interv[0] <= end){
                end = Math.max(end, interv[1]);
            } else {
                result.add(new int[]{start, end});
                start = interv[0];
                end = interv[1];
            }
        }
        result.add(new int[]{start, end});
        return result.toArray(new int[0][]);
    }

    public static void main(String arg[]) {
        int[][] arr = {{1,3},{2,6},{5,7},{8,10},{15,18}};
        System.out.println(merge(arr));
    }

}
