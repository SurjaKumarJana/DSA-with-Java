package queue;

import java.util.LinkedList;
import java.util.Queue;

/*
problem url: https://leetcode.com/problems/implement-stack-using-queues/
 */
public class ImplementStackUsingQueues {
    Queue<Integer> q;

    public ImplementStackUsingQueues() {
        q = new LinkedList();
    }

    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        int n = q.size();
        for(int i = 0; i<n-1; i++){
            q.add(q.remove());
        }
        return q.remove();
    }

    public int top() {
        int n = q.size();
        for(int i = 0; i<n-1; i++){
            q.add(q.remove());
        }
        int value = q.peek();
        q.add(q.remove());
        return value;
    }

    public boolean empty() {
        return q.size()==0;
    }
}
