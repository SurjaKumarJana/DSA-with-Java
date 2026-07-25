package binarySearchTree.medium;

import binaryTree.TreeNode;

/*
problem url: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class LowestCommonAncestorOfABST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return root;
        //root is smaller than both go right
        if(root.val<p.val && root.val<q.val) return lowestCommonAncestor(root.right, p, q);
        //root is greater than both, go left
        else if(root.val>p.val && root.val>q.val) return lowestCommonAncestor(root.left, p, q);

        //else return current, as it is the lowest common ancestor
        return root;
    }
}
