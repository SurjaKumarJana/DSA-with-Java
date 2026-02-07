package linkedList;

/*
problem url: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class IntersectionOfTwoLinkedLists {
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //calculating the length of linkedLists
        ListNode temp = headA;
        int lengthA = 0;
        while(temp!=null){
            lengthA++;
            temp = temp.next;
        }

        temp = headB;
        int lengthB = 0;
        while(temp!=null){
            lengthB++;
            temp = temp.next;
        }

        ListNode t1 = headA;
        ListNode t2 = headB;

        if(lengthA>lengthB){
            for(int i=0; i<lengthA-lengthB; i++){
                t1 = t1.next;
            }
        }else{
            for(int i=0; i<lengthB-lengthA; i++){
                t2 = t2.next;
            }

        }

        while(t1!=null){
            if(t1 == t2) return t1;
            t1 = t1.next;
            t2 = t2.next;
        }


        return null;
    }
}
