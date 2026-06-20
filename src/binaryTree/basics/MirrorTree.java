package binaryTree.basics;


/*
problem url: https://www.geeksforgeeks.org/problems/mirror-tree/1
 */

import binaryTree.Node;

public class MirrorTree {
    void mirror(Node root) {
        if(root == null) return;

        //swapping of nodes
        Node node = root.left;
        root.left = root.right;
        root.right = node;

        //recursive calls to rearrange the child nodes
        mirror(root.left);
        mirror(root.right);

    }
}
