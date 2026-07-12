package binaryTree.medium;


/*
problem url: https://www.geeksforgeeks.org/problems/postorder-traversal-iterative/1
 */

import binaryTree.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class IterativePostorder {
    ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;

        Stack<Node> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()){
            Node node = st.pop();
            list.add(node.val);

            //add element in reverse PreOrder
            if(node.left!=null) st.push(node.left);
            if(node.right!=null) st.push(node.right);

        }
        Collections.reverse(list);
        return list;

    }
}
