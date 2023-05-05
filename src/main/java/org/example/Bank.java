package org.example;

public class Bank {
    private Integer amount = 10000;
    // T1 - wait
    // T2 - Finish -> notify
    // T3 - Finish -> notify


    // shared resource
    // Java Scheduler
    // monitor    acquiring lock    releasing lock
    public int getAmount() {

        synchronized (amount) {

        }
        return amount;
    }

    public synchronized void transfer(int money) {
        int count = 1;
        while (money > 0) {
            if(count == 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            amount -= money;
            System.out.println(count++ + ". [" + Thread.currentThread().getName() + "]" + ": Subtracted 100$");
            money -= 100;
        }

        // PECS
        // happens before

        amount -= money;
        System.out.println("Finish!");
        notify();

    } // inconsistent state

    public synchronized void receive(int balance) {
        amount += balance;
    }

    // TODO next synchronized, Monitor-s, wait, notify, notifyAll, volatile, deadlock, livelock, Concurrent Collections
    // TODO next -> Producer - Consumer problem, synchronizers
}
