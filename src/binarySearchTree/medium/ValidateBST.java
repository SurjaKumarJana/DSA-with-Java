package binarySearchTree.medium;

import binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
problem url: https://leetcode.com/problems/validate-binary-search-tree/
 */
public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root,list);
        return validate(list);
    }

    public void inOrder(TreeNode root, List<Integer> list){
        if(root == null) return;

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
    public boolean validate(List<Integer> list){
        int n = list.size();
        for(int i = 1; i<n; i++){
            if(list.get(i-1)>=list.get(i)) return false;
        }
        return true;
    }
}
