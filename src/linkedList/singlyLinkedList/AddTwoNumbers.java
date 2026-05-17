package linkedList.singlyLinkedList;

/*
problem url: https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;

        // new list that contains the addition
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        int carry = 0;
        int sum = 0;

        while(t1!=null && t2!=null){
            sum = carry+t1.val+t2.val;

            if(sum>9) carry = 1;
            else carry = 0;

            temp.next = new ListNode(sum%10);

            // moving the pointers
            temp = temp.next;
            t1 = t1.next;
            t2 = t2.next;
        }

        if(t2==null){
            while(t1!=null){
                sum = carry+t1.val;
                if(sum>9) carry = 1;
                else carry = 0;
                temp.next = new ListNode(sum%10);

                //moving the pointers
                temp = temp.next;
                t1 = t1.next;
            }
        }else{
            while(t2!=null){
                sum = carry+t2.val;
                if(sum>9) carry = 1;
                else carry = 0;
                temp.next = new ListNode(sum%10);

                //moving the pointers
                temp = temp.next;
                t2 = t2.next;
            }
        }


        if(carry!=0) temp.next = new ListNode(1);


        return dummy.next;
    }
}
