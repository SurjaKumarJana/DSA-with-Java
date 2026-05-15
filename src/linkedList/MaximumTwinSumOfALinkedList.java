package linkedList;

/*
problem url: https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
 */
public class MaximumTwinSumOfALinkedList {


    public int pairSum(ListNode head) {
        int max = Integer.MIN_VALUE;
        ListNode slow = head;
        ListNode fast = head;

        // find left middle
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;

        // reverse the second part
        head2 = reverseList(head2);

        // find the max sum
        ListNode i = head;
        ListNode j = head2;
        while(i!=null){
            int sum = i.val+j.val;
            if(sum>max) max = sum;// update max
            // move to the next node
            i = i.next;
            j = j.next;
        }


        return max;
    }

    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
