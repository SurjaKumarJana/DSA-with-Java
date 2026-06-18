package binaryTree.basics;

import binaryTree.TreeNode;

/*
problem url: https://leetcode.com/problems/count-complete-tree-nodes/
 */
public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        return (root == null) ? 0 : 1+countNodes(root.left)+countNodes(root.right);
    }
}
