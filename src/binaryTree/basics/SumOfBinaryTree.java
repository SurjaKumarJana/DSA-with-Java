package binaryTree.basics;

import binaryTree.Node;

/*
problem url: https://www.geeksforgeeks.org/problems/sum-of-binary-tree/1
 */
public class SumOfBinaryTree {
    static int sumBT(Node root) {
        return (root == null) ? 0 : root.val +sumBT(root.left)+sumBT(root.right);

    }
}
