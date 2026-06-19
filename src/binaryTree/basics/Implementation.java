package binaryTree.basics;

import binaryTree.Node;

public class Implementation {
    public static void main(String[] args) {
        /*    example binary tree
                   3
                /     \
               4        2
             /   \    /   \
           -1     1   6    4
         */
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(4);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;
        display(a);
        System.out.println();
        System.out.println("size of binary tree is : "+size(a));


        preOrder(a);
        System.out.println();
        inOrder(a);
        System.out.println();
        postOrder(a);
        System.out.println();
    }

    public static void display(Node root){
        if(root == null) return;
        display(root.left);
        System.out.print(" "+root.val+"");
        display(root.right);
    }

    public static int size(Node root){
        if(root == null) return 0;
        //size = this node + No. of nodes in the left subtree + No. of nodes in the right subtree
        return 1 + size(root.left)+ size(root.right);
    }

    //preOrder traversal in BT
    public static void preOrder(Node root){
        if(root == null) return;
        System.out.print(" "+root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    //inOrder traversal in BT
    public static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(" "+root.val+" ");
        inOrder(root.right);
    }
    //postOrder traversal in BT
    public static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(" "+root.val+" ");
    }
}
