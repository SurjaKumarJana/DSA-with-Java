package binaryTree.medium;

/*
problem url: https://leetcode.com/problems/binary-tree-level-order-traversal/
 */

import binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    //method 1:
    /*
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        bfs(root,ans);
        return ans;
    }
    public void bfs(TreeNode root, List<List<Integer>> ans){
        Queue<Pair> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        int currLevel = 1;
        q.add(new Pair(root,1));

        while(!q.isEmpty()){
            Pair front = q.remove();

            //if the level chages add previous list to ans and clear the list
            if(front.level != currLevel){
                ans.add(list);
                list= new ArrayList<>();//clear the list;
                currLevel++;
            }
            list.add(front.node.val);// now add the current level values to list

            //add child nodes in the queue
            if(front.node.left != null) q.add(new Pair(front.node.left, front.level+1));
            if(front.node.right != null) q.add(new Pair(front.node.right, front.level+1));

        }
        ans.add(list); // add the last level nodes to ans
    }
*/
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        //edge case: if root is null, return empty list
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            //each iteration is a level of binary tree

            List<Integer> list = new ArrayList<>();
            int levelSize = q.size();

            for(int i = 0; i<levelSize; i++){
                TreeNode node = q.remove();
                //inserting node to the current level list
                list.add(node.val);

                // inserting the child nodes to the queue
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            //inserting the current level elements to the final list;
            result.add(list);
        }

        return result;

    }
}
