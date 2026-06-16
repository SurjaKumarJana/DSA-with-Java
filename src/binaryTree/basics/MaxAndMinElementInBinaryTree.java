package binaryTree.basics;

import binaryTree.Node;

/*
problem url: https://www.geeksforgeeks.org/problems/max-and-min-element-in-binary-tree/1
 */
public class MaxAndMinElementInBinaryTree {
    public static int findMax(Node root) {
        //base case:
        if(root == null ) return Integer.MIN_VALUE;

        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);

        if(root.val>leftMax && root.val>rightMax) return root.val;
        else{
            if(leftMax>rightMax) return leftMax;
        }
        return rightMax;
    }

    public static int findMin(Node root) {
        //base case:
        if(root == null ) return Integer.MAX_VALUE;

        int leftMin = findMin(root.left);
        int rightMin = findMin(root.right);

        if(root.val<leftMin && root.val<rightMin) return root.val;
        else{
            if(leftMin<rightMin) return leftMin;
        }
        return rightMin;
    }
}
