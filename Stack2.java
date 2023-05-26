package com.strukturdata.stackNqueuetipekarakter;

public class Stack2 {
    private char[] dataArray2;
    private int top, capacity;

    public Stack2(int capacity) {
        this.capacity = capacity;
        dataArray2 = new char[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(char element) {
        if (isFull()) {
            System.out.println("Tumpukan Penuh");
            return;
        }
        top++;
        dataArray2[top] = element;
    }

    public char pop(int karakter) {
        if (!isEmpty()) {
            if (karakter <= top + 1) {
                System.out.print("Elemen yang dihapus: ");
                for (int i = 0; i < karakter; i++) {
                    System.out.print(dataArray2[top--] + " ");
                }
                System.out.println();
            } else {
                System.out.println("JUmlah elemen yang akan dihapus melebihi kapasitas");
            }
        } else {
            System.out.println("Tumpukan Kosong, isi terlebih dahulu");
        }
        return 0;
    }
    public void printStack(){
        if (isEmpty()){
            System.out.println("Tumpukan kosong! Isi terlebih dahulu");
        }else {
            System.out.print("Data dalam tumpukan: ");
            for (int i=top; i>=0; i--){
                System.out.print(dataArray2[i]+" ");
            }
        }
    }
}
