package binaryTree.medium;




/*
problem url: https://www.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1
 */

import binaryTree.Node;

import java.util.ArrayList;
import java.util.List;

public class MinDistanceBetweenTwoNodesBinaryTree {
    public int findDist(Node root, int p, int q) {

        List<Node> pathOfP = new ArrayList<>();
        List<Node> pathOfQ = new ArrayList<>();

        rootToNodePath(root, p, pathOfP);
        rootToNodePath(root, q, pathOfQ);

        int minLen = Math.min(pathOfP.size(),pathOfQ.size());
        int lcaIdx = 0;
        for(int i = 0; i<minLen; i++){
            if(pathOfP.get(i) != pathOfQ.get(i)) break;
            lcaIdx++;
        }
        return (pathOfP.size()-lcaIdx) + (pathOfQ.size()-lcaIdx);
    }

    public boolean rootToNodePath(Node root, int tar, List<Node> ans){
        //base case:
        if(root == null) return false;

        ans.add(root);
        if(root.val == tar) return true;
        if(rootToNodePath(root.left, tar, ans)) return true;
        if(rootToNodePath(root.right, tar, ans)) return true;
        ans.remove(ans.size()-1);
        return false;
    }
}
