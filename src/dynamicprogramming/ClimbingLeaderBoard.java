package dynamicprogramming;

import java.io.IOException;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClimbingLeaderBoard {

    public static List<Integer> findRank(List<Integer>  ranks, List<Integer>  scores) {
//        leaderBoard.add(1);
//        for(int i = 1; i< ranks.size();i++) {
//            if(ranks.get(i) == ranks.get(i-1)){
//                leaderBoard.add(leaderBoard.get(i-1));
//            } else {
//                leaderBoard.add(leaderBoard.get(i-1) + 1);
//            }
//        }
//        List<Integer> yourRanks = new ArrayList<>();
//        int[] leaderBoard = new int[ranks.size()];
//        leaderBoard[0] = 1;
//        for(int i = 1; i< ranks.size();i++) {
//            if(ranks.get(i) == ranks.get(i-1)){
//                leaderBoard[i] = leaderBoard[i-1];
//            } else {
//                leaderBoard[i] = leaderBoard[i-1] + 1;
//            }
//        }
//
//        for(int i =0;i<scores.size();i++) {
//            if(scores.get(i) > ranks.get(0)) {
//                yourRanks.add(1);
//            } else if(scores.get(i) < ranks.get(ranks.size()-1)) {
//                yourRanks.add(leaderBoard[ranks.size()-1] + 1);
//            } else {
//                int index = binarySearch(ranks,scores.get(i));
//                yourRanks.add(leaderBoard[index]);
//            }
//        }
        List<Integer> yourRanks = new ArrayList<>();
        for(int score : scores) {
            int currentRank = 0;
            int previousRank=0;
            for(int rank : ranks) {
                if(score >= rank) {
                    break;
                } else {
                    if(previousRank != rank) currentRank++;
                    previousRank = rank;
                }
            }
            yourRanks.add(currentRank+1);
        }
        return yourRanks;
    }

    private static int binarySearch(List<Integer> arr, int key) {
        int lo = 0;
        int hi = arr.size()-1;
        while (lo <= hi) {
            int mid = (lo + hi) /2;
            if(key == arr.get(mid) ) return mid;
            else if(key < arr.get(mid) && key >= arr.get(mid+1)) return mid+1;
            else if (key > arr.get(mid) && key < arr.get(mid -1)) return mid;
            else if (key < arr.get(mid)) lo = mid+1;
            else if (key > arr.get(mid)) hi = mid-1;
        }
        return  -1;
    }
    public static void main(String[] args) throws IOException {
        //int[] arr = {2,4 ,3 ,5 ,2 ,6,4 ,5};
        //int n = 8;
        List<Integer> ranks = Arrays.asList(100 ,100, 50 ,40 ,40, 20, 10);
        List<Integer> scores = Arrays.asList(5 ,25, 50, 120);
        List<Integer> yourRanks = findRank(ranks,scores);
        System.out.println("   ");
    }
}


//    int mid = lo + (hi - lo) / 2;
//		if (a[mid] == key) {
//                return mid;
//         } else if (a[mid] < key && key < a[mid - 1]) {
//        return mid;
//        } else if (a[mid] > key && key >= a[mid + 1]) {
//        return mid + 1;
//        } else if (a[mid] < key) {
//        hi = mid - 1;
//        } else if (a[mid] > key) {
//        lo = mid + 1;
//        }
