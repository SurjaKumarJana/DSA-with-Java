package setAndMap.medium;

/*
problem url: https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1
 */


import binaryTree.Node;
import binaryTree.basics.Pair;
import java.util.*;

/*      solution using HashMap, TC = O(n), SC --> O(n)
    -------------------------------------------        */
public class BottomViewOfBinaryTree {

    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>(); //<horizontal dist, value of node>
        int minDist = Integer.MAX_VALUE;
        int maxDist = Integer.MIN_VALUE;

        //bfs
        Queue<Pair> q = new LinkedList<>();
        if(root!=null) q.add(new Pair(root,0));

        while(!q.isEmpty()){
            Pair pair = q.remove();
            Node node = pair.node;
            int dist = pair.dist;

            //work
            map.put(dist, node.data);
            minDist = Math.min(dist,minDist);
            maxDist = Math.max(dist, maxDist);

            if(node.left != null) q.add(new Pair(node.left, pair.dist-1));
            if(node.right != null) q.add(new Pair(node.right, pair.dist+1));
        }

        for(int i=minDist; i<=maxDist; i++){
            list.add(map.get(i));
        }
        return list;
    }
}
