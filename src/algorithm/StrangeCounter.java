package algorithm;

import java.util.HashMap;
import java.util.Map;

public class StrangeCounter {

    public static long strangeCounter(long t) {
//        int startNumber = 3;
//        int counter = startNumber;
//        //Map<Integer, Integer> myMap = new HashMap<>();
//        for(int i=1; i<=t; i++) {
//            if (startNumber ==0) {
//                counter = counter * 2;
//                startNumber = counter;
//            }
//            //myMap.put(i,startNumber);
//            if (i<t) startNumber--;
//        }
//        return startNumber;
        long startNewCounter = 1;
        while(t >= startNewCounter) {
            startNewCounter = (startNewCounter*2) + 2;
        }
        return startNewCounter-t;

    }

    public static void main(String []arg) {
        System.out.println(strangeCounter(17));
    }
}
