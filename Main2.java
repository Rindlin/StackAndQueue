package com.strukturdata.stackNqueuetipekarakter;

import java.util.Scanner;


public class Main2 {
    public static void display1() {
        System.out.print("\n===================================" +
                "\n======PROGRAM STACK DAN QUEUE======" +
                "\n===================================" +
                "\n1. Tambah Data (String)" +
                "\n2. Tampil Data Stack" +
                "\n3. Tampil Data Queue" +
                "\n4. Hapus Data Stack (Pop Data)" +
                "\n5. Hapus Data Queue (Dequeue Data)" +
                "\n6. Exit" +
                "\n===================================" +
                "\nMasukkan Pilihan ==>");
    }


    public static void main(String[] args) {
        int choose, count;
        String dataIn;

        Scanner input = new Scanner(System.in);
        Stack2 stack = new Stack2(7);
        Queue2 queue = new Queue2(7);
        count = 0;

        while (true) {
            display1();
            choose = input.nextInt();
            input.nextLine();
            if (choose==1){
                System.out.print("Masukkan Data Apapun (String): ");
                dataIn = input.nextLine();
                char[] inArray = dataIn.toCharArray();
                for (char dataArray : inArray) {
                    if (dataArray != ' ') {
                        if (count < 7) {
                            stack.push(dataArray);
                            count++;
                        } else {
                            queue.enqueue(dataArray);
                        }
                    }
                }

            } else if (choose==2) {
                stack.printStack();

            } else if (choose==3) {
                queue.printQueue();

            } else if (choose==4) {
                System.out.print("Berapa yang elemen ingin dikeluarkan?: ");
                int dataOut= input.nextInt();
                input.nextLine();
                stack.pop(dataOut);

            } else if (choose==5) {
                System.out.print("Berapa yang elemen ingin dikeluarkan?: ");
                int dataOut= input.nextInt();
                input.nextLine();
                queue.dequeue(dataOut);

            } else if (choose==6) {
                System.out.println("Terima kasih");
                break;
            }else {
                System.out.println("Pilihan Anda tidak tersedia");


        }
        }
        input.close();
    }
}

