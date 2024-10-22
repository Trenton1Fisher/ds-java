package com.trentonfisher.datastructures.linkedlist;

public class LinkedList {
    class Node {
        private int data;
        private Node next;

        public Node(int defaultValue) {
            this.data = defaultValue;
            this.next = null;
        }
    }

    private Node head;

    public LinkedList(int defaultValue) {
        this.head = new Node(defaultValue);
    }

    public void add(int value) {
        Node temp = this.head;
        
        while (temp.next != null) {
            temp = temp.next; 
        }
        
        Node newNode = new Node(value);
        temp.next = newNode; 
    }

    public void printList() {
        Node temp = this.head;
        System.out.println("---- Printing Linked List ----");
        if (temp == null) {
            System.out.println("List is empty.");
            return;
        }
        while (temp != null) { 
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != null) { 
                System.out.print(", ");
            }
        }
        System.out.println(); 
    }
}
