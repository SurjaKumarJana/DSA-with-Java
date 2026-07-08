package binaryTree.medium;

import binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
problem url: https://leetcode.com/problems/path-sum-ii/
 */
public class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        findPath(root, targetSum, paths, list);
        return paths;
    }

    public void findPath(TreeNode root, int targetSum, List<List<Integer>> ans, List<Integer> list) {
        if (root == null) return;

        list.add(root.val);
        targetSum -= root.val;

        if (root.left == null && root.right == null) {//leaf node
            if (targetSum == 0) {
                ans.add(new ArrayList<>(list));
            }
        } else {
            findPath(root.left, targetSum, ans, list);
            findPath(root.right, targetSum, ans, list);
        }

        list.remove(list.size() - 1); // backtrack
    }
}
