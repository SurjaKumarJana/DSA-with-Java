package linkedList.singlyLinkedList;

import java.util.HashSet;
import java.util.Set;

/*
problem url: https://leetcode.com/problems/linked-list-components/
 */

public class LinkedListComponents {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int components = 0;
        boolean inComponent = false;

        for (ListNode cur = head; cur != null; cur = cur.next) {
            if (set.contains(cur.val)) {
                if (!inComponent) {
                    components++;      // entering a new component
                    inComponent = true;
                }
            } else {
                inComponent = false;   // leaving a component
            }
        }

        return components;
    }
}
