package org.example;

import org.example.thread.MyFirstThread;
import org.example.thread.MySecondThread;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        long startTime = System.currentTimeMillis();

        System.out.println(Thread.currentThread()); // main

        MyFirstThread myFirstThread = new MyFirstThread("my-thread-1");
        myFirstThread.start();
//        myFirstThread.join(10000);

        MySecondThread mySecondThread = new MySecondThread("my-thread-2");
        mySecondThread.start();

        /*arrayProblem1();
        arrayProblem2();

        System.out.println("processes took " + (System.currentTimeMillis() - startTime)/1000 + "seconds");*/

    }

    private static void arrayProblem2() {
        long min = 723;
        for (long index = 0; index < 21873322333L; index++) {  // i = 2, j = 6
            if(min > index) {
                min = index;
            }
        }
        System.out.println(Thread.currentThread()); // main
        System.out.println("min number is " + min);
    }

    private static void arrayProblem1() {
        long max = 723;
        for (long index = 0; index < 17873322333L; index++) {  // i = 2, j = 6
            if(max < index) {
                max = index;
            }
        }
        System.out.println(Thread.currentThread()); // main
        System.out.println("max number is " + max);
    }
}