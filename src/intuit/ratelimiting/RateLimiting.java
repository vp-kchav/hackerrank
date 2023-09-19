package intuit.ratelimiting;

import java.util.HashMap;

public class RateLimiting {
    static HashMap<String, Tuple> cache = new HashMap<String, Tuple>();

    public static void main(String arg[]) throws InterruptedException {
        //false
        System.out.println(rateLimit("device_info", 30, 3));
        Thread.sleep(45000);
        System.out.println(rateLimit("device_info", 30, 3));
        Thread.sleep(45000);
        System.out.println(rateLimit("device_info", 30, 3));
        Thread.sleep(45000);
        //true
        System.out.println(rateLimit("device_info", 30, 3));
    }

    public static boolean rateLimit(String key, int intervalInSecs, int maxLimit) {
        long currTimeSecs = System.currentTimeMillis() / 1000;
        long scaleSeconds = currTimeSecs / intervalInSecs;

        if(cache.containsKey(key)){
            Tuple tuple = cache.get(key);
            if (tuple.getScaleTimePeriod() == scaleSeconds){
                System.out.println("Bucket found for this period");
                if(tuple.getNumberOfRequest() >= maxLimit){
                    // Block
                    return true;
                }
                tuple.setNumberOfRequest(tuple.getNumberOfRequest() + 1);
            } else {
                System.out.println("The bucket has expired, replace with a new one");
                tuple = new Tuple(scaleSeconds);
                cache.put(key, tuple);
            }
            // Do not block
            return false;

        } else {
            System.out.println("Bucket not found, create a new one");
            Tuple tuple = new Tuple(scaleSeconds);
            cache.put(key, tuple);
            // Do not block
            return false;
        }
    }
}
