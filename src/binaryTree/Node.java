package binaryTree;

public class Node {
    public int val;
    public Node left;//left child node
    public Node right;//right child node

    public Node(int val){
        this.val = val;
    }
    public Node(int val, Node left, Node right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
