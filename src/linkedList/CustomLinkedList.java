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

    void display(Node node){
        Node temp = node;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    // search method which returns the index of element in o(n) time complexity
    int search(int val){
        if(head == null) return -1;

        Node temp = head;
        int idx =0;
        while(temp != null){
            if(temp.val == val){
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    //insertion at idx position
    void insert(int idx, int val){
        if(idx<0 || idx>size) {
            System.out.println("Invalid operation, out of bound index");
            return;
        }
        if(idx==0) {
            addAtBeginning(val);
            return;
        }
        if(idx == size){
            add(val);
            return;
        }

        Node temp = head;
        for(int i =0; i<idx ; i++){
            temp = temp.next;
        }

        Node newElement = new Node(val);
        newElement.next = temp.next;
        temp.next = newElement;
        size++;
    }

    //delete function
    void delete(int idx){
        if(idx<0 || idx >= size) System.out.println("index out of bound");
        if(idx==0) {
            deleteHead();
            return;
        }
        Node temp = head;
        for(int i=0 ; i<idx ;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;//deleting node at idx index

        if(idx == size-1) tail = temp;
        size--;
    }
}
