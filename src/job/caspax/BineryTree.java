package job.caspax;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BineryTree extends BT {
    public List<Integer> zigZagTraversal() {
        List<Integer> result = new ArrayList<>();
        if(rootNode == null) {
            return result;
        }
        Stack<Node> currentLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();
        boolean leftToRight = true;
        currentLevel.push(rootNode);
        while(!currentLevel.isEmpty()) {
            Node currentNode = currentLevel.pop();
            result.add(currentNode.data);
            if(leftToRight) {
                if(currentNode.rightChild != null){
                    nextLevel.push(currentNode.rightChild);
                }
                if(currentNode.leftChild != null) {
                    nextLevel.push(currentNode.leftChild);
                }
            } else {
                if(currentNode.leftChild != null){
                    nextLevel.push(currentNode.leftChild);
                }
                if(currentNode.rightChild != null) {
                    nextLevel.push(currentNode.rightChild);
                }
            }
            if(currentLevel.isEmpty()) {
                leftToRight = !leftToRight;
                currentLevel = nextLevel;
                nextLevel = new Stack<>();
            }
        }
        return result;
    }
}
