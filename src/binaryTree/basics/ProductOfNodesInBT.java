package binaryTree.basics;

import binaryTree.Node;

public class ProductOfNodesInBT {
    int getProduct(Node root){
        return (root == null) ? 1 : root.val*getProduct(root.left)*getProduct(root.right);
    }
}
