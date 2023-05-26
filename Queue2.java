package com.strukturdata.stackNqueuetipekarakter;

public class Queue2 {
    private char[] dataArray;
    private int front, rear, size, capacity;

    public Queue2(int capacity){
        this.capacity = capacity;
        dataArray = new char[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == capacity;
    }
    public void enqueue(char element){
        if (isFull()){
            System.out.println("Antrian Penuh");
            return;
        }
        rear = (rear + 1)% capacity;
        dataArray[rear] = element;
        size++;
    }
    public char dequeue(int karakter){
        if (!isEmpty()){
            if (karakter<=size){
                System.out.print("Elemen yang dihapus: ");
                for (int i=0; i<karakter; i++){
                    System.out.print(dataArray[front++]+" ");
                    if (front==capacity){
                        front=0;
                    }
                }
                System.out.println();
                size -= karakter;
            }else {
                System.out.println("Jumlah elemen yang ingin dihapus melebihi batas");
            }
        }else {
            System.out.println("Antrian kosong, isi terlebih dahulu");
        }

        return 0;
    }
    public void printQueue(){
        if (isEmpty()){
            System.out.println("Antrian Kosong! Isi terlebih dahulu");
        }else {
            System.out.print("Data dalam antrian: ");
            for (int i=0; i<size; i++){
                System.out.print(dataArray[(front + i)% capacity]+" ");
            }
        }
    }
}
