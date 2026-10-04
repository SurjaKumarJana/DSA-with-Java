package binaryTree.basics;

import binaryTree.Node;
import binaryTree.TreeNode;

public class Pair{
    public Node node;
    public TreeNode treeNode;
    public int dist;
    public Integer level;
    public int time;


    public Pair(Node node, Integer level){
        this.node = node;
        this.level = level;
    }
    public Pair(Node node, int dist){
        this.node = node;
        this.dist = dist;
    }

    public Pair(TreeNode node, int t){
        this.treeNode = node;
        this.time = t;
    }
}