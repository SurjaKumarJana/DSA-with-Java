package binaryTree.medium;

import binaryTree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
problem url: https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1
 */
public class LeftViewOfBinaryTree {
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        //edge case :
        if(root == null) return list;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){

            int n = q.size();//get the size;

            //get the left element from the queue and add it to the final list
            Node leftNode = q.remove();
            list.add(leftNode.val);
            if(leftNode.left != null) q.add(leftNode.left);
            if(leftNode.right != null) q.add(leftNode.right);


            // remove all the other elements of current level
            for(int i = 0; i < n-1; i++){
                Node node = q.remove();
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }

        }

        return list;
    }
}
