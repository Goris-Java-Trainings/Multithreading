package org.example;

import org.example.thread.MyFirstThread;
import org.example.thread.MySecondThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Hello world!");
//        long startTime = System.currentTimeMillis();

        System.out.println(Thread.currentThread()); // main

        /*Thread thread1 = new Thread() {
            public int count = 10000;

            public int getCount() {
                return count;
            }
            @Override
            public void run() {
                for(; count < 1; count--) {
                    System.out.println("Thread 2 prints: " + count);
                }
            }
        };
        thread1.start();


        Thread thread2 = new Thread() {
            public int count = 1000;

            public int getCount() {
                return count;
            }

            @Override
            public void run() {

                System.out.println(Thread.currentThread());

                for(int count = 1000; count > 980; count--) {

                    if(count == 990) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("Thread 2 prints: " + count);
                }
            }
        };
        thread2.start();*/

        System.out.println(Thread.currentThread());
        // synchronization

        Bank bankAccount = new Bank();

        Thread transaction1 = new Thread() {
            @Override
            public void run() {
                bankAccount.transfer(100);
            }
        };
        transaction1.start();

        Thread transaction2 = new Thread() {
            @Override
            public void run() {
                bankAccount.transfer(100);
            }
        };
        transaction2.start();

        /*bankAccount.transfer(100);
        bankAccount.transfer(100);*/
        /*transaction2.join();
        transaction1.join();*/

        Thread.sleep(1);
        System.out.println(bankAccount.getAmount());






        /*myFirstThread.wait();
        myFirstThread.notify();
        myFirstThread.notifyAll();*/

        /*System.out.println("Started sleeping");
        Thread.sleep(5000); // 2000 / 1000 = 2 sec
        System.out.println("Finished sleeping");*/

//        myFirstThread.join(10000);

        // asynchronous
        // synchronous

        /*MySecondThread mySecondThread = new MySecondThread("my-thread-2");
        mySecondThread.start();*/

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