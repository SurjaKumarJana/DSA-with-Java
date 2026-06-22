package binaryTree.basics;

import binaryTree.TreeNode;

/*
problem url: https://leetcode.com/problems/path-sum/
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        //base case;
        if(root.left==null && root.right==null) {
            if(targetSum == root.val) return true;
            else return false;
        }
        targetSum-=root.val;
        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);
    }
}
