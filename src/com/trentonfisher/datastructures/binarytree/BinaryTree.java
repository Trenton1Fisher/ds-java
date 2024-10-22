package com.trentonfisher.datastructures.binarytree;

public class BinaryTree {
    class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int initialValue){
            this.value = initialValue;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    public BinaryTree(){
        this.root = null;
    }

    public void addNode(int value){
       root = insertRec(root, value);
    }

    public Node insertRec(Node root, int value){
        if(root == null){
            return new Node(value);
        }
        if(value <= root.value){
            root.left = insertRec(root.left, value);
        }else if(value > root.value){
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public void printPre(){
        printDFS(this.root);
    }

    public void printDFS(Node node){
        if(node != null){
            System.out.print(node.value + " ");
            printDFS(node.left);
            printDFS(node.right);
        }
    }

}
