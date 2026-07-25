package binarySearchTree.medium;

import binaryTree.TreeNode;

/*
problem url: https://leetcode.com/problems/convert-bst-to-greater-tree/
 */
public class ConvertBSTToGreaterTree {
    public TreeNode convertBST(TreeNode root) {
        convert(root,0);
        return root;
    }

    public int convert(TreeNode root,int inc) {
        //base case;
        if(root == null) return inc;

        inc = convert(root.right, inc);
        root.val += inc;
        inc = root.val;
        inc = convert(root.left, inc);
        return inc;
    }
}
