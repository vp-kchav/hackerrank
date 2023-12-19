package Tree;

public class GFG {

    /* Helper function that allocates a new node with the
        given data and NULL left and right pointers. */
    static Node newNode(int data) {
        Node node = new Node();
        node.data = data;
        node.left = node.right = null;

        return node;
    }

    static int maxValue(Node node)
    {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        int value = node.data;
        int leftMax = maxValue(node.left);
        int rightMax = maxValue(node.right);

        return Math.max(value, Math.max(leftMax, rightMax));
    }

    static int minValue(Node node)
    {
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        int value = node.data;
        int leftMax = minValue(node.left);
        int rightMax = minValue(node.right);

        return Math.min(value, Math.min(leftMax, rightMax));
    }

    /* Returns true if a binary tree is a binary search tree
     */
    static int isBST(Node node)
    {
        if (node == null) {
            return 1;
        }
        /* false if the max of the left is > than us */
        if (node.left != null
                && maxValue(node.left) > node.data) {
            return 0;
        }

        /* false if the min of the right is <= than us */
        if (node.right != null
                && minValue(node.right) < node.data) {
            return 0;
        }

        /* false if, recursively, the left or right is not a
         * BST*/
        if (isBST(node.left) != 1
                || isBST(node.right) != 1) {
            return 0;
        }

        /* passing all that, it's a BST */
        return 1;
    }

    public static void main(String[] args)
    {
        Node root = newNode(4);
        root.left = newNode(2);
        root.right = newNode(5);

        // root->right->left = newNode(7);
        root.left.left = newNode(1);
        root.left.right = newNode(3);

        // Function call
        if (isBST(root) == 1) {
            System.out.print("Is BST");
        }
        else {
            System.out.print("Not a BST");
        }
    }
    
}
