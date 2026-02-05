package linkedList;

public class CustomLinkedList {
    Node head;
    Node tail;
    int size;
    void add(int val){

        Node temp = new Node(val);
        if(tail == null){
            head = tail = temp;
        }else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void addAtBeginning(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void deleteHead(){
        if(head == null){
            System.out.println("List is Empty! can't delete the head");
        }
        head = head.next;
        if(head == null) tail = null;

        size--;
    }
    public void display(Node node){
        Node temp = node;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
}
