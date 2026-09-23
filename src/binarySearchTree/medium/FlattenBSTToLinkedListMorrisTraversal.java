package binarySearchTree.medium;

/*
problem url: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
 */

import binaryTree.TreeNode;

public class FlattenBSTToLinkedListMorrisTraversal {

    //method 3: using modified Morris traversal ,t.c ==> O(n) , s.c ==> O(1);
    public void flatten(TreeNode root) {
        TreeNode curr = root;

        while(curr != null){
            // left != null
            if(curr.left != null){
                //find predecessor
                TreeNode pred = curr.left;
                while(pred.right!=null){
                    pred = pred.right;
                }
                pred.right = curr.right;//link to the right subtree
                curr.right = curr.left; // unlink the right subtree from root
                curr.left = null; // remove the left elements

                //move current node
                curr = curr.right;

            }else{//left == null
                curr = curr.right;
            }
        }
    }
}
