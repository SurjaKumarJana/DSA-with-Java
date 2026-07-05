package binaryTree.medium;


import binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
problem url: https://leetcode.com/problems/binary-tree-right-side-view/
 */
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        //edge case :
        if(root == null) return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int n = q.size();//get the size;
            // remove till the second last element of the queue and add the child
            for(int i = 0; i < n-1; i++){
                TreeNode node = q.remove();
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            TreeNode rightNode = q.remove();
            list.add(rightNode.val);
            if(rightNode.left != null) q.add(rightNode.left);
            if(rightNode.right != null) q.add(rightNode.right);
        }

        return list;
    }
}
