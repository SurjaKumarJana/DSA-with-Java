package binarySearchTree.basics;

import binaryTree.TreeNode;

/*
problem url: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */

public class ConvertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums,0,nums.length-1);
    }
    public TreeNode buildBST(int[] nums, int left, int right) {
        //base case
        if(left>right) return null;

        int rootIdx = (left+right)/2;
        TreeNode root = new TreeNode(nums[rootIdx]);
        root.left = buildBST(nums, left, rootIdx-1);
        root.right = buildBST(nums,  rootIdx+1, right);

        return root;
    }
}
