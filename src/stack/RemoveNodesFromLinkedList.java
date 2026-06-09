package stack;

import linkedList.singlyLinkedList.ListNode;

import java.util.Stack;

/*
problem url: https://leetcode.com/problems/remove-nodes-from-linked-list/
 */
public class RemoveNodesFromLinkedList {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;

        while(temp!=null){

            //pop all the smaller values in this stack
            while(!stack.isEmpty() && stack.peek().val<temp.val){
                stack.pop();
            }
            stack.push(temp);
            temp = temp.next;
        }


        ListNode tail = stack.pop();
        // for safely remove other nodes
        tail.next = null;
        while (!stack.isEmpty()){
            ListNode node = stack.pop();
            node.next = tail;
            tail = node;
        }

        return tail;
    }
}
