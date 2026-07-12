package binaryTree.medium;

/*
problem url: https://www.geeksforgeeks.org/problems/inorder-traversal-iterative/1
 */

import binaryTree.Node;

import java.util.ArrayList;
import java.util.Stack;

public class IterativeInorder {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> st = new Stack<>();

        Node curr = root;

        while(curr!=null || !st.isEmpty()){

            if(curr!=null){
                if(curr.left != null){
                    st.push(curr);
                    curr = curr.left;
                }else {
                    list.add(curr.val);
                    curr = curr.right;
                }
            }else{
                Node top = st.pop();
                list.add(top.val);
                curr = top.right;
            }
        }

        return list;
    }
}
