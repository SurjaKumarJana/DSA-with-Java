package queue;

import java.util.LinkedList;
import java.util.Queue;

public class BasicQueue {
    public static void main(String[] args) {

        //we implement Queue data Structure using LinkedList or ArrayDeque classes in java
        Queue<Integer> queue = new LinkedList<>();

        //**queue has 4 basic operations link stack**
        //1. addding value
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println(queue);

        //2. removing element from the rear side
        queue.remove();
        System.out.println(queue);

        //3. viewing the front element
        System.out.println(queue.peek());

        //4. viewing the size of the queue
        System.out.println(queue.size());


        //**adding, removing, peeking element at any index**
        //1.adding at any position
        System.out.println(queue);
        addAt(queue,70,2);
        System.out.println(queue);



        //checking the working of QueueUsingLinkedList
        QueueUsingLinkedList q = new QueueUsingLinkedList();
        q.add(100);
        q.add(200);
        q.add(300);
        q.add(400);
        q.display();
        q.remove();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }

    //function to add a value at a given position
    public static void addAt(Queue<Integer>queue, int element, int index){
        //initial queue : 10 20 30 40 50
        int n = queue.size();
        for(int i = 0; i<index; i++){
            // remove the element from the front and add at beginning
            queue.add(queue.remove());
        }
        //queue: 40 50 10 20 30
        //add the new element at the end
        queue.add(element);
        //queue: 40 50 10 20 30 60

        //run a loop for (n-index) time to add rest of the element to the end of queue
        for(int i = 0; i<(n-index); i++){
            queue.add(queue.remove());
        }


    }


}
