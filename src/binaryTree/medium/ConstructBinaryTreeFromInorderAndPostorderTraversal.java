package binaryTree.medium;


/*
problem url: https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 */

import binaryTree.TreeNode;

public record ConstructBinaryTreeFromInorderAndPostorderTraversal() {

    public TreeNode buildTree(int[] inOrder, int[] postOrder) {
        int n = postOrder.length;
        return constructTree(inOrder, postOrder, 0, n-1, 0, n-1);
    }
    public TreeNode constructTree(int[] inOrder, int[] postOrder, int postLow, int postHigh, int inLow, int inHigh ){

        //base case:
        if(postLow>postHigh) return null;

        int rootVal = postOrder[postHigh];
        int rootIdx = getRootIndex(inOrder, rootVal, inLow, inHigh);
        int leftCount = rootIdx-inLow;

        TreeNode root = new TreeNode(rootVal);
        root.left = constructTree(inOrder, postOrder, postLow, postLow+leftCount-1, inLow, rootIdx-1);
        root.right = constructTree(inOrder, postOrder, postLow+leftCount, postHigh-1, rootIdx+1, inHigh);

        return root;
    }
    public int getRootIndex(int[] arr, int root, int low, int high){
        for(int i=low; i<=high; i++){
            if(arr[i] == root) return i;
        }
        return -1;
    }
}
