package binarySearchTree.hard;

import binaryTree.TreeNode;

/*
problem url: https://leetcode.com/problems/maximum-sum-bst-in-binary-tree/
 */

public class MaximumSumBST {
    public int maxSum = 0;

    public int maxSumBST(TreeNode root) {
        getInfo(root);
        return maxSum;
    }
    public Info getInfo(TreeNode root){
        //base case
        if(root == null) return new Info(Integer.MAX_VALUE, Integer.MIN_VALUE, true, 0);
        Info lst = getInfo(root.left);
        Info rst = getInfo(root.right);

        boolean isBST = lst.isBST && rst.isBST && (root.val>lst.max && root.val<rst.min);
        int max = Math.max(root.val, Math.max(lst.max, rst.max));
        int min = Math.min(root.val, Math.min(lst.min, rst.min));
        int sum = (isBST)? lst.sum+rst.sum+root.val : 0;

        //update the maxSum if possible
        if(sum>maxSum) maxSum = sum;

        return new Info(min, max, isBST, sum);
    }
}
