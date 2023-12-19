package intuit.lrucache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRULinkedHashMap {
    private LinkedHashMap<Integer, Integer> map;
    private int CAPACITY;
    public LRULinkedHashMap(int capacity) {
        CAPACITY = capacity;
        map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > CAPACITY;
            }
        };
    }
    public int get(int key) {
        return map.getOrDefault(key, -1);
    }
    public void set(int key, int value) {
        map.put(key, value);
    }
}
