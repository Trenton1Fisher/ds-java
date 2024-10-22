package com.trentonfisher.datastructures.queue;

//iffy class but it works for the premise of just reiterating a queue for a reminder
public class Queue {
    private int front;
    private int rear;
    private int[] data;
    final int CAPACITY = 50;

    public Queue(){
        this.rear = -1;
        this.front = 0;
        this.data = new int[50];
    }

    public void enqueue(int value) {
        if (rear == CAPACITY - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        data[++rear] = value;
    }

    public int dequeue(){
       if(isEmpty()){
        System.out.println("Queue Underflow");
            return -1;
       }
       return data[front++];
    }

    public boolean isEmpty(){
        return this.data.length == 0;
    }

    public void print(){
        System.out.println("--- Printing Queue ---");
     for(int i = this.front; i <= this.rear; i++){
        System.out.print(this.data[i] + ", ");
     }
    }
}
