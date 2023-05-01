package org.example;

public class Bank {
    private int amount = 10000;

    public int getAmount() {
        return amount;
    }

    public /*synchronized*/ void transfer(int money) {
        amount -= money;
    } // inconsistent state

    // TODO next synchronized, wait, notify, notifyAll, Monitor-s, volatile
    // TODO next -> Producer - Consumer problem, synchronizers, deadlock, livelock
}
