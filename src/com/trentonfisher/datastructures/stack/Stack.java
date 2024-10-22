package com.trentonfisher.datastructures.stack;

public class Stack {
    private int top;
    private int[] data;

    public Stack(){
        this.top = -1;
        this.data = new int[50];
    }

    public void push(int value){
        if(this.top == 50){
            System.out.println("Stack Overflow");
            return;
        }
        this.data[this.top++] = value;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return this.data[this.top--];
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public void print(){
        if(this.top == -1){
            System.out.println("Stack is empty cannot print content");
            return;
        }
        System.out.println("---- Printing Stack ----");
        for(int i = 0; i < this.top; i++){
            System.out.print(this.data[i] + " ");
        }
    }
}
