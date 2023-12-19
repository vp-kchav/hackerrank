package job.caspax;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class BT {
    Node rootNode;
    Map<Integer, Node> dangling = new HashMap<>();

    void addNode(int parent, int child, char direction) {
        Node childNode, parentNode;
        if (!dangling.containsKey(child)) {
            childNode = new Node(child);
            dangling.put(child, childNode);
        }
        else {
            childNode = dangling.get(child);
        }

        if (!dangling.containsKey(parent)) {
            parentNode = new Node(parent);
            dangling.put(parent, parentNode);
        }
        else {
            parentNode = dangling.get(parent);
        }

        if (rootNode == null) {
            rootNode = parentNode;
        }

        if (direction == 'L') {
            parentNode.leftChild = childNode;
        }
        else {
            parentNode.rightChild = childNode;
        }
    }

    int[] getLevelSpiral(){
        List<Integer> levelSpiral1 = new ArrayList();
        int[] levelSpiral = {1,2,3};
        return levelSpiral;
    }

    public void printZigZagTraversal() {
        if (rootNode == null) {
            return;
        }
        // declare two stacks
        Stack<Node> currentLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();
        // push the root
        currentLevel.push(rootNode);
        boolean leftToRight = true;
        // check if stack is empty
        while (!currentLevel.isEmpty()) {
            // pop out of stack
            Node node = currentLevel.pop();

            // print the data in it
            System.out.print(node.data + " ");

            // store data according to current
            // order.
            if (leftToRight) {
                if (node.rightChild != null) {
                    nextLevel.push(node.rightChild);
                }
                if (node.leftChild != null) {
                    nextLevel.push(node.leftChild);
                }
            }
            else {
                if (node.leftChild != null) {
                    nextLevel.push(node.leftChild);
                }
                if (node.rightChild != null) {
                    nextLevel.push(node.rightChild);
                }
            }
            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight;
                //Stack<Node> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = new Stack<>();;
            }
        }
    }

    public Node buildTree(String s) {
        // Corner Case
        if (s.length() == 0 || s.charAt(0) == 'N') {
            return null;
        }
        // Creating list of strings from input string after spliting by space
        String[] ip = s.split(" ");
        // Create the root of the tree
        rootNode = new Node(Integer.parseInt(ip[0]));
        int size = 0;
        Deque<Node> q = new LinkedList<>();
        // Push the root to the queue
        q.add(rootNode);
        size++;
        // Starting from the second element
        int i = 1;
        while (size > 0 && i < ip.length) {
            // Get and remove the front of the queue
            Node currNode = q.peek();
            q.pop();
            size--;
            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {
                // Create the left child for the current node
                currNode.leftChild = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                q.add(currNode.leftChild);
                size++;
            }
            // For the right child
            i++;
            if (i >= ip.length) {
                break;
            }
            currVal = ip[i];
            // If the right child is not null
            if (!currVal.equals("N")) {
                // Create the right child for the current node
                currNode.rightChild = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                q.add(currNode.rightChild);
                size++;
            }
            i++;
        }
        return rootNode;
    }
}
