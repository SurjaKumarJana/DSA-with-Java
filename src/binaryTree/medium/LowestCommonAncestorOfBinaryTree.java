package binaryTree.medium;




/*
problem url: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 */

import binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestorOfBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> pathOfP = new ArrayList<>();
        List<TreeNode> pathOfQ = new ArrayList<>();

        rootToNodePath(root, p, pathOfP);
        rootToNodePath(root, q, pathOfQ);

        int minLen = Math.min(pathOfP.size(), pathOfQ.size());
        TreeNode lca = pathOfP.get(0); // root, guaranteed common start

        for (int i = 0; i < minLen; i++) {
            if (pathOfP.get(i) != pathOfQ.get(i)) break;
            lca = pathOfP.get(i);
        }

        return lca;
    }
    public boolean rootToNodePath(TreeNode root,TreeNode target,List<TreeNode> ans){
        //base case:
        if(root == null) return false;

        ans.add(root);// add current node;

        if(root.val == target.val) return true;

        if(rootToNodePath(root.left, target, ans)) return true;//search in the left subtree
        if(rootToNodePath(root.right, target, ans)) return true;//search in the right subTree;

        ans.remove(ans.size()-1); //if search fails remove the current insertion;

        return false;
    }
}
