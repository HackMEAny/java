package com.example.basic.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Q {
    int num;
    boolean setValue = false;

    public synchronized void put(int num) {
        while (setValue) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("PUT -> " + num);
        setValue = true;
        this.num = num;
        notify();
    }

    public synchronized void get() {
        while (!setValue) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("GET -> " + num);
        setValue = false;
        notify();
    }
}

class Producer implements Runnable {
    Q q;

    public Producer(Q q) {
        this.q = q;
        Thread thread = new Thread(this, "PRODUCER");
        thread.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class Consumer implements Runnable {
    Q q;

    public Consumer(Q q) {
        this.q = q;
        Thread thread = new Thread(this, "Consumer");
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class executer implements Runnable {

    int i;

    public executer(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("D3f4ult -> " + Integer.toString(this.i));
        System.out.println("Run Hit -> ");
    }

}

public class InterThread {
    public static void main(String[] args) {
        // Q q = new Q();
        // new Producer(q);
        // new Consumer(q);

        // Executor

        ExecutorService e = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            e.execute(new executer(i));
        }
        e.shutdown();
    }
}
