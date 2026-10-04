package setAndMap.medium;

/*
problem url: https://leetcode.com/problems/copy-list-with-random-pointer/
 */

import binaryTree.Node;
import java.util.*;

/*      solution using HashMap, TC = O(n), SC --> O(n)
    -------------------------------------------        */
public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();// original list node -----> copy list node
        Node copy = copyList(head, map);
        Node temp = head;
        while(temp!=null){
            //copy.random   =     list.random's copy
            map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }
        return copy;
    }
    public Node copyList(Node head, HashMap<Node, Node> map){
        Node head2 = new Node(-1);

        Node i  = head;
        Node j = head2;

        while(i!=null){
            Node node = new Node(i.val);//create a copy of nodes of list
            j.next = node;
            map.put(i, node);
            j = j.next;
            i = i.next;

        }
        j.next = null;

        return head2.next; // return the copied linkedlist
    }
}
