package binaryTree.basics;

import binaryTree.Node;

/*
problem url: https://www.geeksforgeeks.org/problems/size-of-binary-tree/1
 */
public class SizeOfBinaryTree {
    public int getSize(Node root) {
        return (root == null) ? 0 : 1+getSize(root.left)+getSize(root.right);

    }
}
