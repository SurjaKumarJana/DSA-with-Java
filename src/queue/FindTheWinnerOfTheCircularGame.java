package queue;

import java.util.LinkedList;
import java.util.Queue;

/*
problem url: https://leetcode.com/problems/find-the-winner-of-the-circular-game/
 */
public class FindTheWinnerOfTheCircularGame {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i<=n; i++){
            q.add(i);
        }
        while(q.size()>1){
            for(int i = 0; i<k-1; i++){
                q.add(q.remove());
            }
            q.remove();
        }


        return q.peek();
    }
}
