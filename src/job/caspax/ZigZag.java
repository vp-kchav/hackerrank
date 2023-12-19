package job.caspax;

import com.sun.source.tree.BinaryTree;

import java.util.List;
import java.util.Scanner;

public class ZigZag {
    public static void main (String[] args) throws java.lang.Exception {
//        BT bt = new BT();
//        Scanner in = new Scanner(System.in);
//        int edges, parent, child;
//        char direction;
//        int[] levelSpiral;
//        edges = in.nextInt();
//        for(int i=0; i<edges; i++){
//            parent = in.nextInt();
//            child = in.nextInt();
//            direction = in.next().charAt(0);
//            bt.addNode(parent, child, direction);
//        }
//        levelSpiral = bt.getLevelSpiral();
//        for (int i=0; i<levelSpiral.length; i++){
//            System.out.print(levelSpiral[i]+" ");
//        }

        BT tree = new BT();
        tree.rootNode = new Node(1);
        tree.rootNode.leftChild = new Node(2);
        tree.rootNode.rightChild = new Node(3);
        tree.rootNode.leftChild.leftChild = new Node(4);
        tree.rootNode.leftChild.rightChild = new Node(5);
        tree.rootNode.rightChild.leftChild = new Node(6);
        tree.rootNode.rightChild.rightChild = new Node(7);

        System.out.println("ZigZag Order traversal of binary tree is");
        //tree.printZigZagTraversal();
        System.out.println();
        System.out.println("------------------");
        BineryTree myBT = new BineryTree();
        String s = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24";
        myBT.buildTree(s);
        List<Integer> list = myBT.zigZagTraversal();
        System.out.println(list);
    }
}
