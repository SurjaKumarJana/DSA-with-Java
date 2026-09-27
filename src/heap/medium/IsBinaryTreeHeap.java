package heap.medium;

/*
problem url: https://www.geeksforgeeks.org/problems/is-binary-tree-heap/1
 */

import binaryTree.Node;

/*      solution using recursion, TC = O(n)
    -------------------------------------------        */
public class IsBinaryTreeHeap {
    int size;

    public boolean isHeap(Node root) {
        size = getSize(root);
        return isMaxHeap(root) && isCBT(root,1); //TC --> O(n)
    }

    //TC --> O(n)
    public int getSize(Node root){
        if(root == null) return 0;
        return getSize(root.left) + getSize(root.right) +1;
    }

    public boolean isMaxHeap(Node root){
        if(root == null) return true;

        int left = (root.left != null) ? root.left.data : Integer.MIN_VALUE;
        int right = (root.right != null) ? root.right.data : Integer.MIN_VALUE;

        if(root.data<=left || root.data<=right) return false;

        return isMaxHeap(root.left) && isMaxHeap(root.right);// TC --> O(n)
    }

    //TC --> O(n)
    public boolean isCBT(Node root, int idx){
        //base case;
        if(root == null) return true;

        if(idx > size) return false;

        return isCBT(root.left, 2*idx) && isCBT(root.right, 2*idx+1);
    }
}
