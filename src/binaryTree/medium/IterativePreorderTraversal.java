package binaryTree.medium;


/*
problem url: https://www.geeksforgeeks.org/problems/preorder-traversal-iterative/1
 */

import binaryTree.Node;
import java.util.ArrayList;
import java.util.Stack;


public class IterativePreorderTraversal {
    ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;

        Stack<Node> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()){
            Node node = st.pop();
            list.add(node.val);

            //for preOrder add right first then left
            if(node.right!=null) st.push(node.right);
            if(node.left!=null) st.push(node.left);
        }

        return list;

    }
}
