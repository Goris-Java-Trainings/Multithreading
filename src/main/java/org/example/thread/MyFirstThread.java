package org.example.thread;

public class MyFirstThread extends Thread {

    public MyFirstThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        arrayProblem1();
        System.out.println(Thread.currentThread()); // MyFirstThread
    }

    private void arrayProblem1() {
        long startTime = System.currentTimeMillis();

        long max = 723;
        for (long index = 0; index < 17873322333L; index++) {  // i = 2, j = 6
            if(max < index) {
                max = index;
            }
        }
        System.out.println("max number is " + max);
        System.out.println("process-1 took " + (System.currentTimeMillis() - startTime)/1000 + "seconds");
    }
}
