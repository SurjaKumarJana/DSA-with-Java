package binarySearchTree.medium;

/*
problem url: https://www.geeksforgeeks.org/problems/print-bst-elements-in-given-range/1
 */

import binaryTree.Node;

import java.util.ArrayList;
import java.util.Collections;

public class BSTKeysInARange {
    public ArrayList<Integer> nodesInRange(Node root, int low, int high) {
        ArrayList<Integer> result = new ArrayList<>();
        getNodes(root, low, high, result);
        Collections.sort(result);
        return result;
    }
    public void getNodes(Node root, int low, int high, ArrayList<Integer> result) {

        if(root == null) return;

        if(root.val>high) getNodes(root.left, low, high, result);
        else if(root.val<low) getNodes(root.right, low, high, result);
        else{//else case : low<=root.val>=high
            getNodes(root.left, low, high, result);
            getNodes(root.right, low, high, result);
            result.add(root.val);
        }
    }
}
