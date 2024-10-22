package com.trentonfisher.datastructures;

import com.trentonfisher.datastructures.stack.Stack;
import com.trentonfisher.datastructures.linkedlist.LinkedList;
import com.trentonfisher.datastructures.queue.Queue;
import com.trentonfisher.datastructures.dynamicarray.DynamicArray;

class main {
    public static void main(String[] args) {
        final int[] numberTest = { 4, 5, 5, 3, 2, 4, 3, 2, 1, 2, 32, 3, 2, 4, 3, 5, 5, 66, 7, 8, 8, 9, 9 };

        Stack stack = new Stack();
        LinkedList list = new LinkedList(14);
        Queue queue = new Queue();
        DynamicArray dynarray = new DynamicArray();

        //STACK
        System.out.println("=====================");
        System.out.println("... Loading Stack ...");
        System.out.println("=====================");
        System.out.println("");
        for(int value: numberTest){
            stack.push(value);
        }
        stack.print();
        System.out.println("");
        System.out.println("");
        System.out.println("=====================");
        System.out.println("... Popping from Stack ...");
        System.out.println("=====================");
        System.out.println("");
        for(int i = 0; i < 4; i++){
            stack.pop();
        }
        stack.print();
        System.out.println("");
        System.out.println("");

        //QUEUE
        System.out.println("=====================");
        System.out.println("... Loading Queue ...");
        System.out.println("=====================");
        System.out.println("");
        for(int value: numberTest){
            queue.enqueue(value);
        }
        queue.print();
        System.out.println("");
        System.out.println("");
        System.out.println("=====================");
        System.out.println("... Dequeuing from queue ...");
        System.out.println("=====================");
        System.out.println("");
        for(int i = 0; i < 4; i++){
            queue.dequeue();
        }
        queue.print();
        System.out.println("");
        System.out.println("");

        //DYNAMIC ARRAY
        System.out.println("=====================");
        System.out.println("... Loading Dynamic Array ...");
        System.out.println("=====================");
        System.out.println("");
        for(int value: numberTest){
            dynarray.add(value);
        }
        dynarray.print();

        //LINKED LIST
        System.out.println("");
        System.out.println("");
        System.out.println("=====================");
        System.out.println("... Loading Linked List ...");
        System.out.println("=====================");
        System.out.println("");
        for(int value: numberTest){
            list.add(value);
        }
        list.printList();




    }
}