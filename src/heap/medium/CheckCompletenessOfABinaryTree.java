package heap.medium;

/*
problem url: https://leetcode.com/problems/check-completeness-of-a-binary-tree/
 */

import binaryTree.TreeNode;

/*      solution using recursion, TC = O(n)
    -------------------------------------------        */
public class CheckCompletenessOfABinaryTree {
    int size;

    //TC --> O(n)
    public boolean isCompleteTree(TreeNode root) {
        size = getSize(root);
        return checkCBT(root, 1);
    }
    //TC --> O(n)
    public int getSize(TreeNode root){
        if(root == null) return 0;
        return getSize(root.left) + getSize(root.right) +1;
    }
    //TC --> O(n)
    public boolean checkCBT(TreeNode root, int idx){
        //base case;
        if(root == null) return true;

        if(idx > size) return false;

        return checkCBT(root.left, 2*idx) && checkCBT(root.right, 2*idx+1);
    }
}
