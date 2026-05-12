package linkedList;


/*
problem url: https://www.geeksforgeeks.org/problems/partition-a-linked-list-around-a-given-value/1
 */

public class PartitionList2 {

    public static Node partition(Node node, int tar) {
        Node d1 = new Node(-1);
        Node d2 = new Node(-1);
        Node d3 = new Node(-1);

        Node t1 = d1;
        Node t2 = d2;
        Node t3 = d3;

        Node t = node;

        while(t!=null){
            if(t.data<tar){
                t1.next = t;
                t1 = t1.next;
            }else if(t.data == tar){
                t2.next = t;
                t2 = t2.next;
            }else{
                t3.next = t;
                t3 = t3.next;
            }
            t = t.next;
        }

        t1.next = d2.next;
        t2.next = d3.next;
        t3.next = null;

        return d1.next;


    }   
}
