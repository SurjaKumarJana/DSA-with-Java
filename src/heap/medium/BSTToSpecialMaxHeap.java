package heap.medium;

/*
problem url: https://www.geeksforgeeks.org/problems/bst-to-max-heap/1
 */

import binaryTree.Node;

import java.util.ArrayList;
import java.util.List;

/*      solution using recursion, TC = O(n)
    -------------------------------------------        */
public class BSTToSpecialMaxHeap {

    public static void convertToMaxHeap(Node root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root, list);//TC --> O(n)
        postOrder(root,list);//TC --> O(n)
    }

    public static void preOrder(Node root, List<Integer> list){
        if(root == null) return;

        //left call
        preOrder(root.left, list);
        //work
        list.add(root.data);
        //right call
        preOrder(root.right, list);

    }
    public static void postOrder(Node root, List<Integer> list){
        if(root == null) return;

        //left
        postOrder(root.left, list);
        //right
        postOrder(root.right, list);
        //root
        root.data = list.remove(0);

    }
}
