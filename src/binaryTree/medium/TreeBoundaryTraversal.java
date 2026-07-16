package binaryTree.medium;


/*
    problem url: https://www.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1
 */

import binaryTree.Node;

import java.util.ArrayList;

public class TreeBoundaryTraversal {

    public ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(root.val);
        if(root.left==null && root.right==null)  return list;//if the root is leaf node in the beginning

        insertLeftNodes(root.left, list);
        insertLeafNodes(root, list);
        insertRightNodes(root.right, list);

        return list;
    }

    //function to add all the left side nodes
    public void insertLeftNodes(Node root, ArrayList<Integer> list){
        if(root == null) return;
        if(root.left == null && root.right == null) return;

        list.add(root.val);
        if(root.left != null) insertLeftNodes(root.left, list);
        else insertLeftNodes(root.right, list);
    }

    //simple preorder traversal where we will add all the leaf nodes
    public void insertLeafNodes(Node root, ArrayList<Integer> list){
        if(root == null) return;
        if(root.left==null && root.right==null) list.add(root.val);//leaf node
        insertLeafNodes(root.left,list);
        insertLeafNodes(root.right,list);
    }

    //function to add right side nodes
    public void insertRightNodes(Node root, ArrayList<Integer> list){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        if(root.right != null) insertRightNodes(root.right, list);
        else insertRightNodes(root.left, list);
        list.add(root.val);
    }
}
