package stack;


public class StackUsingLinkedList {

    private Node top;
    int len;

    public void push(Integer x){
        Node temp = new Node(x,top);
        top = temp;
        len++;
    }

    public Integer pop(){
        if(top == null){
            System.out.println("Stack is empty!");
            return null;
        }
        Integer value = top.data;
        top = top.next;
        len--;
        return value;
    }

    public Integer peek(){
        if(top == null){
            System.out.println("Stack is empty!");
            return null;
        }
        return top.data;
    }

    public int size(){
        return len;
    }

    public void printStack(){
        Node temp = top;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

}
