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
                removeNode(tail);
                map.remove(tail.key);
                addAtFront(newNode);
            } else {
                addAtFront(newNode);
            }
            map.put(key, newNode);
        }
    }

    private void addAtFront(Node node) {
        node.next = head;
        //node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        //check for first time add we need to assign tail to the first node added
        if (tail == null) {
            tail = node;
        }
    }

    private void removeNode(Node node) {

        //re assgign previous
        if (node.prev == null) { //head has no previous so if it is null meaning we remove head => assign new head with removedNode.next
            head = node.next;
        } else {
            node.prev.next = node.next;
        }
        //reassign next
        if (node.next == null) { // tail has no next(last one) so if it is null meaning we remove tails => assign ne tail with removedNode.previous
            tail = node.prev;
        } else {
            node.next.prev = node.prev;
        }
    }
}
