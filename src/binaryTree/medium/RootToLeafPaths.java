package binaryTree.medium;

import binaryTree.Node;

import java.util.ArrayList;

/*
problem url: https://www.geeksforgeeks.org/problems/root-to-leaf-paths/1
 */
public class RootToLeafPaths {
    public ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        findPaths(root,list,ans);
        return ans;
    }
    public void findPaths(Node root, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans) {
        //base case
        if(root == null) return;

        list.add(root.val);

        //check if it is root node or not
        if(root.left == null && root.right == null) ans.add(new ArrayList<>(list));//insert and shallow copy


        findPaths(root.left,list,ans);
        findPaths(root.right,list,ans);
        list.remove(list.size()-1);

    }

}
