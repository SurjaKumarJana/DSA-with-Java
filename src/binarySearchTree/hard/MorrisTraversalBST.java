package binarySearchTree.hard;

/*
problem url: https://leetcode.com/problems/binary-tree-inorder-traversal/
 */

import binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class MorrisTraversalBST {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();

        TreeNode curr = root;

        //iterate through all the nodes
        while(curr != null){
            if(curr.left != null){
                //find the predecessor
                TreeNode pred = curr.left;
                while(pred.right!=null && pred.right != curr){
                    pred = pred.right;
                }

                if(pred.right == null){
                    pred.right = curr;//linking of nodes
                    curr = curr.left;
                }
                else{
                    pred.right = null;//unlink the nodes
                    list.add(curr.val);
                    curr = curr.right;

                }


            }else{
                //left==null
                list.add(curr.val);
                //go right
                curr = curr.right;
            }
        }

        return list;
    }
}
