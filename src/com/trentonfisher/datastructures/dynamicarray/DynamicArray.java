package com.trentonfisher.datastructures.dynamicarray;

public class DynamicArray {
    private int size;
    private int capacity;
    private int[] array;

    public DynamicArray(){
        this.size = 0;
        this.capacity = 10;
        this.array = new int[this.capacity];
    }

    public void add(int newValue){
        if(this.size == this.capacity){
            resize();
        }
        this.array[size++] = newValue;
    }

    public void resize(){
        int[] temp = new int[this.capacity * 2];
        System.arraycopy(this.array, 0, temp, 0, this.size);
        this.capacity *=2;
        this.array = temp;
    }

    public void print(){
        System.out.println("---- Printing dynamic array ----");
        for(int i = 0; i < this.size; i++){
            System.out.print(" " + this.array[i]);
        }
    }

    public int findIndex(int index) {
        if (index < 0 || index >= this.size) {
            return -9999;
        }
        return this.array[index]; 
    }
      
}
