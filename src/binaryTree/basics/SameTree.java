package binaryTree.basics;

/*
problem url: https://leetcode.com/problems/same-tree/
 */

import binaryTree.TreeNode;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //base case:
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;// check if there are odd number of nodes

        // check the current roots are same or not
        if(p.val != q.val) return false;

        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));

    }
}
