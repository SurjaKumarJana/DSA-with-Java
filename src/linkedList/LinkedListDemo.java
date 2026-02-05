package linkedList;


public class LinkedListDemo{

    public static void main(String[] args) {

        //sample linkedList ===
        //10 --> 20 --> 30 --> 40 --> 50 --> 60

        //creating nodes
        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        Node d = new Node();
        Node e = new Node();

        //assigning values;
        a.val=10;
        b.val=20;
        c.val=30;
        d.val=40;
        e.val=50;

        //linking nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        display(a);

    }
    public static void display(Node node){
        Node temp = node;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

}