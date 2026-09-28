package heap.hard;


/*
problem url: https://leetcode.com/problems/find-median-from-data-stream/
 */


import java.util.Collections;
import java.util.PriorityQueue;

/*      solution using max Heap and min Heap both, TC = O(klogk)
    -------------------------------------------        */
public class FindMedianFromDataStream {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    //init the heaps
    public FindMedianFromDataStream() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    //TC --> O(nlogn)
    public void addNum(int num) {

        //insertion of element
        if(maxHeap.isEmpty()){
            maxHeap.add(num);
        }else{

            if(num<maxHeap.peek()){
                maxHeap.add(num);
            }
            else {
                minHeap.add(num);
            }
        }

        //re-arrangement of elements,
        //we want to keep n/2 elements in each heap at a time
        if(maxHeap.size()>minHeap.size()+1){
            minHeap.add(maxHeap.remove());
        }
        if(minHeap.size()>maxHeap.size()+1){
            maxHeap.add(minHeap.remove());
        }
    }

    //TC --> O(logn)
    public double findMedian() {
        if(maxHeap.size()>minHeap.size()) return maxHeap.peek();
        else if(minHeap.size()>maxHeap.size()) return minHeap.peek();
        else return (maxHeap.peek()+minHeap.peek())/2.0;
    }
}
