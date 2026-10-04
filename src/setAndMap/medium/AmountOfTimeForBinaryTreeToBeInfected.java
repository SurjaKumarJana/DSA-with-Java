package setAndMap.medium;

/*
problem url: https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/
 */


import binaryTree.TreeNode;
import binaryTree.basics.Pair;
import java.util.*;

/*      solution using HashMap, TC = O(n), SC --> O(n)
    -------------------------------------------        */
public class AmountOfTimeForBinaryTreeToBeInfected {

    TreeNode start;
    HashMap<TreeNode, TreeNode> map;

    public int amountOfTime(TreeNode root, int tar) {
        start = null;
        map = new HashMap<>();
        HashSet<TreeNode> set = new HashSet<>();

        //get the parent TreeNode information... and infected node
        dfs(root, tar);

        //calculate the time using bfs
        Queue<Pair> q = new LinkedList<>();
        int time = 0;
        q.add(new Pair(start, time));
        while(!q.isEmpty()){
            Pair pair = q.remove();
            TreeNode node = pair.node;
            time = pair.time;

            set.add(node);

            //if parent exits in map
            TreeNode parent = map.getOrDefault(node, null);
            if( parent!=null && !set.contains(parent)) {
                q.add(new Pair(parent, time+1));
                set.add(parent);
            }

            //left
            if(node.left!=null && !set.contains(node.left)) {
                q.add(new Pair(node.left, time+1));
                set.add(node.left);
            }

            //right
            if(node.right!=null && !set.contains(node.right)) {
                q.add(new Pair(node.right, time+1));
                set.add(node.right);
            }

        }

        return time;
    }


    public void dfs(TreeNode root, int tar){
        //base case
        if(root == null) return;

        //inserting parent root info
        if(root.left != null) map.put(root.left, root);
        if(root.right != null) map.put(root.right, root);

        //searching the infected node
        if(root.val == tar) start = root;

        dfs(root.left, tar);
        dfs(root.right, tar);
    }

}
