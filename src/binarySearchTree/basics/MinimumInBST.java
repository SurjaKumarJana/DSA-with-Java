package binarySearchTree.basics;

import binaryTree.Node;

/*
problem url: https://www.geeksforgeeks.org/problems/minimum-element-in-bst/1
 */

public class MinimumInBST {
    public int minValue(Node root) {
        if(root == null) return -1;
        int min = root.val;
        Node temp = root;
        while(temp != null) {
            min = temp.val;
            temp = temp.left;
        }
        return min;
    }
}
