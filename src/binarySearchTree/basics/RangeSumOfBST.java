package binarySearchTree.basics;

/*
problem url: https://leetcode.com/problems/range-sum-of-bst/
 */

import binaryTree.TreeNode;

public class RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;

        if(root.val>high) return rangeSumBST(root.left, low, high);
        else if(root.val<low) return rangeSumBST(root.right, low, high);
        //else case : low<=root.val>=high
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}
