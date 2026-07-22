package binarySearchTree.medium;

/*
problem url: https://www.geeksforgeeks.org/problems/count-bst-nodes-that-lie-in-a-given-range/1
 */

import binaryTree.Node;

public class CountBSTNodesInRange {
    int getCount(Node root, int low, int high) {
        if(root == null) return 0;

        if(root.val>high) return getCount(root.left, low, high);
        else if(root.val<low) return getCount(root.right, low, high);
        //else case : low<=root.val>=high
        return 1 + getCount(root.left, low, high) + getCount(root.right, low, high);
    }
}
