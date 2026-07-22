package binarySearchTree.basics;

/*
problem url: https://leetcode.com/problems/search-in-a-binary-search-tree/
 */

import binaryTree.TreeNode;

public class SearchInABinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(root.val == val) return root;
        else if(root.val<val) return searchBST(root.right, val); //go right
        return searchBST(root.left, val); //go left
    }
}
