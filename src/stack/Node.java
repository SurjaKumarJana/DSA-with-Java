package stack;

public class Node  {

    public Integer data;
    public Node next;

    public Node(){}
    public Node(Integer x){this.data = x;}
    public Node(Integer x,Node next){
        this.data = x;
        this.next = next;
    }
}
