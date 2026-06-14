package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
problem url: https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
 */
public class FirstNegativeInEveryWindowOfSizeK {
    static List<Integer> firstNegInt(int arr[], int k) {

        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();


        int n = arr.length;//length of the array

        //iterate and push all the indices of negative numbers into the queue
        for(int i = 0; i<n; i++){
            if(arr[i]<0) q.add(i);
        }

        //iterate up to n-k+1 and find the first negative for every window
        for(int i = 0; i<n-k+1; i++){
            //if the peek<i means, a window has expired for this peek so remove it
            while(!q.isEmpty() && q.peek()<i) {
                q.remove();
            }
            //check if the peek lies between i and i+k-1 or not
            if(!q.isEmpty() && q.peek() <= i+k-1){
                ans.add(arr[q.peek()]);
            }else{
                ans.add(0);
            }
        }

        return ans;

    }
}
