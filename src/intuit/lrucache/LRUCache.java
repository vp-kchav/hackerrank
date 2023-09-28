package intuit.lrucache;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    Node head;
    Node tail;
    HashMap<Integer, Node> map;
    int cap;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.map = new HashMap<>();
    }

//    public LRUCache(int capacity) {
//        cap = capacity;
//        map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true){
//            protected boolean removeEldestEntry(Map.Entry eldest) {
//                return size() > cap;
//            }
//        };
//    }

    public int get(int key) {
        if (map.containsKey(key)) {// Key Already Exist, just update the access order by moving the node to front.
            Node node = map.get(key);
            removeNode(node);
            addAtFront(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) { // key already exists. remove and move to front.
            Node Node = map.get(key);
            Node.value = value;
            removeNode(Node);
            addAtFront(Node);
        } else {
            Node newNode = new Node(key, value);
            if (map.size() >= cap) {// maximum capacity reached. remove least accessed element
                map.remove(tail.key);
                removeNode(tail);
                addAtFront(newNode);
            } else {
                addAtFront(newNode);
            }
            map.put(key, newNode);
        }
    }

    public void addAtFront(Node node) {
        node.next = head;
        //node.prev = null;
        if (head != null) {
            node.next.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = head;
        }
    }

    public void removeNode(Node node) {

        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }
    }
}
