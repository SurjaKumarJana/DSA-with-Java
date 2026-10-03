package binaryTree.basics;

import binaryTree.Node;

public class Pair{
    public Node node;
    public int dist;
    public Integer level;

    public Pair(Node node, Integer level){
        this.node = node;
        this.level = level;
    }
    public Pair(Node node, int dist){
        this.node = node;
        this.dist = dist;
    }
}