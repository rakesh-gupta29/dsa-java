package BST;

public class Node {
    int val = 0;
    Node left = null;
    Node right = null;

    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public Node ( int val ) {
        this.val = val ;
    }
}
