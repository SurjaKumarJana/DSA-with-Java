package binaryTree.basics;

import binaryTree.TreeNode;

/*
problem url: https://leetcode.com/problems/symmetric-tree/
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isInverted(root.left, root.right);
    }
    public boolean isInverted(TreeNode p, TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;

        if(p.val != q.val) return false;

        return isInverted(p.left,q.right)&&isInverted(p.right,q.left);
    }
}
