package binaryTree.medium;

import binaryTree.TreeNode;

/*
problem url: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
 */
public class FlattenBinaryTreeToLinkedList {
    //method 1: using an arraylist , t.c ==> O(n) , s.c ==> O(n);
    /*
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        preOrder(root,list);

        //change connection till the second last element;
        for(int i = 0; i<list.size()-1; i++){
            list.get(i).left = null;
            list.get(i).right = list.get(i+1);
        }
        //last node already have node.left-->null; node.right-->null;
    }
    public void preOrder(TreeNode root, List<TreeNode> list){
        if(root == null) return;
        list.add(root);
        preOrder(root.left,list);
        preOrder(root.right,list);
    }
    */

    //method 2: using recursion, t.c ==> O(n), s.c ==> O(n);
    public void flatten(TreeNode root) {
        //base case
        if(root == null) return;

        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;

        root.left = null;
        root.right = leftNode;// connect root with the left node

        flatten(leftNode);
        flatten(rightNode);

        //find the last node of the left part
        TreeNode temp = root;

        while( temp.right != null){
            temp = temp.right;
        }

        // connect the left part with the right part of binary Tree
        temp.right = rightNode;

    }
}
