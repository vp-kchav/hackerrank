package job.caspax;

public class Node {
    int data;
    Node leftChild, rightChild, nextRight;

    Node(int value){
        data = value;
        leftChild = null;
        rightChild = null;
        nextRight = null;
    }
}
