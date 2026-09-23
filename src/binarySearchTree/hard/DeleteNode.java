package binarySearchTree.hard;

/*
problem url: https://leetcode.com/problems/delete-node-in-a-bst/
 */

import binaryTree.TreeNode;

public class DeleteNode {
    public TreeNode deleteNode(TreeNode root, int target) {
        if(root == null) return root;

        if(target<root.val){
            //go left
            root.left = deleteNode(root.left, target);

        }
        else if(target>root.val){
            //go right
            root.right = deleteNode(root.right, target);
        }
        else if(target == root.val){
            //val == target
            //case 1: 0 chile node
            if(root.left==null && root.right==null) return null;

            //case 2: 1 child node
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;

            //case 3: 2 child case:
            //find successor and make it root and return it
            TreeNode successor = root.right;
            while(successor.left != null){
                successor = successor.left;
            }
            root.right = deleteNode(root.right,successor.val);
            successor.left = root.left;
            successor.right = root.right;
            return successor;

        }

        return root;//key is not present in bst

    }
}
