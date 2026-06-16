package binaryTree.basics;

/*
problem url: https://leetcode.com/problems/count-complete-tree-nodes/
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        return (root == null) ? 0 : 1+countNodes(root.left)+countNodes(root.right);
    }
}
