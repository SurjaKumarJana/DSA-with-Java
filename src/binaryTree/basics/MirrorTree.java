package binaryTree.basics;


/*
problem url: https://leetcode.com/problems/invert-binary-tree/
 */

import binaryTree.TreeNode;

public class MirrorTree {
    public TreeNode invertTree(TreeNode root) {

        if(root == null) return root;

        // recursive call
        TreeNode t1 = invertTree(root.left);
        TreeNode t2 = invertTree(root.right);

        //swapping of nodes
        root.left = t2;
        root.right = t1;

        return root;
    }
}
