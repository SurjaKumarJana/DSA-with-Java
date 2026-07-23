package binarySearchTree.medium;


/*
problem url: https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 */

import binaryTree.TreeNode;

public class KthSmallestElementInBST {
    int count = 0;
    int result = 0;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return result;
    }
    //function to inorder traversal
    public void inOrder(TreeNode root, int k){
        if(root == null) return;

        //go left
        inOrder(root.left, k);

        //work
        if(count==k) return;
        result = root.val;
        count++;

        //go right
        inOrder(root.right, k);

    }
}
