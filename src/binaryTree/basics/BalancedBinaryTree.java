package binaryTree.basics;

import binaryTree.TreeNode;

/*
problem url: https://leetcode.com/problems/balanced-binary-tree/
 */
public class BalancedBinaryTree {
    //method 1: O(n^2) time complexity solution
    /*
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

    */


    //method 2: with O(n) time complexity solution....

    public static boolean flag;

    public boolean isBalanced(TreeNode root) {
        flag = true;
        getLevels(root);
        return flag;
    }

    public int getLevels(TreeNode root){
        //base case
        if(root == null) return 0;

        int leftLevel = getLevels(root.left);
        int rightLevel = getLevels(root.right);

        //checking the binary tree is balaced or not
        if(Math.abs(leftLevel-rightLevel) > 1) flag = false;

        return Math.max(leftLevel,rightLevel) + 1;
    }
}

