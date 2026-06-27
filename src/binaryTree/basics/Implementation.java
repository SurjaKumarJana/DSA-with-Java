package binaryTree.basics;

import binaryTree.Node;

import java.util.*;

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
//        display(a);
//        System.out.println();
//        System.out.println("size of binary tree is : "+size(a));
//
//
//        preOrder(a);
//        System.out.println();
//        inOrder(a);
//        System.out.println();
//        postOrder(a);
//        System.out.println();
//        levelOrderPrint(a);
        levelOrderPrint2(a);
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
    public static void levelOrderPrint(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node node = q.remove();
            System.out.print(node.val+" ");
            if(node.left != null) q.add(node.left);
            if(node.right != null) q.add(node.right);
        }
        System.out.println();//new line
    }
    public static void levelOrderPrint2(Node root){
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root,1));
        int currlLevel = 1;
        while(!queue.isEmpty()){
            //pop a pair from the queue
            Pair pair = queue.remove();

            //add extra line if it is the first element of a new level
            if(pair.level!=currlLevel) {
                System.out.println();// add an extra line
                currlLevel++;
            }
            //print the current node value
            System.out.print(pair.node.val+" ");

            //insert the child nodes to the queue if not null
            if(pair.node.left != null) queue.add(new Pair(pair.node.left,pair.level+1));
            if(pair.node.right != null) queue.add(new Pair(pair.node.right,pair.level+1));
        }
    }



}
