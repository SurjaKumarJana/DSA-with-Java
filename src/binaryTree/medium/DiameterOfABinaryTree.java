package binaryTree.medium;


/*
problem url: https://leetcode.com/problems/diameter-of-binary-tree/
 */

import binaryTree.TreeNode;

public class DiameterOfABinaryTree {
    public int maxDiameter ;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        getLevels(root);
        return maxDiameter;
    }
    public int getLevels(TreeNode root) {
        //base case:
        if(root == null) return 0;
        int leftLevel = getLevels(root.left);
        int rightLevel = getLevels(root.right);

        int currDiameter = leftLevel + rightLevel;
        if(currDiameter>maxDiameter) maxDiameter = currDiameter;

        return (leftLevel>rightLevel)? leftLevel+1: rightLevel+1;
    }
}
