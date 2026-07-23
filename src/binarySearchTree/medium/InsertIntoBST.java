package binarySearchTree.medium;

/*
problem url: https://leetcode.com/problems/insert-into-a-binary-search-tree/
 */

import binaryTree.TreeNode;

public class InsertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        //base case: if leaf node then insert
        if(root == null) return new TreeNode(val);

        //val>root
        if(val > root.val) {
            root.right = insertIntoBST(root.right, val);
        }
        //val<root
        else{
            root.left = insertIntoBST(root.left, val);
        }

        return root;
    }
}
