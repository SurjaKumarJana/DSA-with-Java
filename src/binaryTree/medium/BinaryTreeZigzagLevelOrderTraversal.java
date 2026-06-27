package binaryTree.medium;

import binaryTree.TreeNode;

import java.util.*;

/*
problem url: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        //edge case: if root == null return empty list
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        boolean leftToRight = true;
        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> list = new ArrayList<>();

            for(int i = 0; i<levelSize; i++){
                TreeNode node = q.remove();
                list.add(node.val);

                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);

            }
            //alternatively, reverse the level order list for zigzag traversal
            if(!leftToRight) Collections.reverse(list);
            //changing the direction
            leftToRight = !leftToRight;
            result.add(list);
        }

        return result;

    }

}
