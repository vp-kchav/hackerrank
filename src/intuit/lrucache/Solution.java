package intuit.lrucache;

//level SSE, SWE2
public class Solution {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);

        cache.put(1, 4);
        cache.put(2, 5);
        cache.put(3, 6);
        System.out.println(cache.get(1)); // returns 4
        //System.out.println(cache.get(3)); // returns -1
        cache.put(4, 7); // removes key 2
        cache.put(5, 8); // removes key 2
        System.out.println(cache.get(2)); // retruns -1
    }
}
