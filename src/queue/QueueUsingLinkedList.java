package queue;

import stack.Node;

public class QueueUsingLinkedList {
    Node head;
    Node tail;
    int size;

    QueueUsingLinkedList(){
        head = null;
        tail = null;
    }
    public void add(int ele){
        //adding element at rear of the queue
        Node node = new Node(ele,null);

        if(size==0) {
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = tail.next;
        }
        size++;
    }
    public int remove(){
        //removing an element from the front of the queue
        int value = -1;
        if(size==0) {
            System.out.println("invalid operation");
        }
        else{
            value = head.data;
            if(size == 1) tail = null;
            head = head.next;
        }
        size--;

        return value;
    }
    public int peek(){
        //peeking the front of the queue

        if(size==0) {
            System.out.println("invalid operation");
            return -1;
        }
        return head.data;
    }

    public void display(){
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}
