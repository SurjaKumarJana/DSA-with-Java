package binaryTree.basics;

import binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
problem url: https://leetcode.com/problems/binary-tree-postorder-traversal/
 */
public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        return list;
    }

    public void dfs(TreeNode root, List<Integer> list){
        //base case: if node == null return
        if(root == null) return;

        dfs(root.left, list);
        dfs(root.right, list);
        list.add(root.val);
    }
}
