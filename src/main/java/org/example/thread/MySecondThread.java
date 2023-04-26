package org.example.thread;

public class MySecondThread extends Thread {

    public MySecondThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        arrayProblem2();
        System.out.println(Thread.currentThread()); // MySecondThread
    }

    private void arrayProblem2() {
        long startTime = System.currentTimeMillis();

        long min = 723;
        for (long index = 0; index < 21873322333L; index++) {  // i = 2, j = 6
            if(min > index) {
                min = index;
            }
        }
        System.out.println("min number is " + min);

        System.out.println("process-2 took " + (System.currentTimeMillis() - startTime)/1000 + "seconds");
    }
}
