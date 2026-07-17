package binaryTree.medium;


/*
problem url: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 */

import binaryTree.TreeNode;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        int n =preOrder.length;
        return constractTree(preOrder,inOrder, 0, n-1, 0, n-1);

    }
    public TreeNode constractTree(int[] preOrder, int[] inOrder,int preLow, int preHigh, int inLow, int inHigh){
        if(preLow>preHigh) return null;

        int rootVal = preOrder[preLow];
        int rootIndex = getRootIndex(inOrder, rootVal, inLow, inHigh);
        int leftCount = rootIndex - inLow;


        TreeNode root = new TreeNode(rootVal);
        root.left = constractTree(preOrder, inOrder, preLow+1, preLow+leftCount, inLow, rootIndex-1);
        root.right = constractTree(preOrder, inOrder, preLow+leftCount+1, preHigh, rootIndex+1, inHigh);

        return root;
    }
    public int getRootIndex(int[] arr,int rootVal,int low, int high){
        for(int i = low; i<=high; i++){
            if(arr[i] == rootVal) return i;
        }
        return 0;
    }
}
