package binaryTree.basics;

import binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
problem url: https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        return list;
    }
    public void dfs(TreeNode root, List<Integer> list){
        //base case: if node == null return
        if(root == null) return;

        list.add(root.val);
        dfs(root.left, list);
        dfs(root.right, list);
    }
}
