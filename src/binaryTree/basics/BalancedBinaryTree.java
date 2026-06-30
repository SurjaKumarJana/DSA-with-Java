package binaryTree.basics;

import binaryTree.TreeNode;

/*
problem url: https://leetcode.com/problems/balanced-binary-tree/
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        //base case:
        if(root == null) return true;

        int leftLevel = getLevels(root.left);
        int rightLevel = getLevels(root.right);

        if(Math.abs(leftLevel-rightLevel) > 1) return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int getLevels(TreeNode root){

        //base case
        if(root == null) return 0;

        int leftLevel = getLevels(root.left);
        int rightLevel = getLevels(root.right);

        return Math.max(leftLevel,rightLevel) + 1;
    }
}
