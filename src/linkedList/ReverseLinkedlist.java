package linkedList;

import java.util.ArrayList;

/*
problem url: https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedlist {

    //method 1: using arrayList
    //time complexity : o(n)
    //space complexity : o(n)
    /*
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ArrayList<ListNode> nodes = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            nodes.add(temp);
            temp = temp.next;
        }

        int n = nodes.size();
        for(int i=n-1; i>0 ; i--){
            nodes.get(i).next = nodes.get(i-1);
        }
        nodes.get(0).next = null;

        return nodes.get(n-1);
    }
     */
    //method 2: iterative  approach
    //time complexity : o(n)
    //space complexity : o(1)
    /*
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;


        while(curr!=null){
            next = curr.next;
            //connect curr with prev
            curr.next = prev;

            //move pointers
            prev = curr;
            curr = next;
        }

        return prev;
    }
     */

    // method 3: recursive approach
    public ListNode reverseList(ListNode head) {
        //base case
        if(head == null || head.next == null) return head;

        ListNode a = head.next;
        head.next = null;
        ListNode b = reverseList(a);
        a.next = head;

        return b;
    }
}
