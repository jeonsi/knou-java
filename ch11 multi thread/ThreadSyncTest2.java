class Counter {
    private int c = 0;
    public void increment() { synchronized(this) {c++;} }
    public void decrement() { synchronized(this) {c--;} }
    // public synchronized void increment() { c++; }
    // public synchronized void decrement() { c--; }
    public int value() { return c; }
}

class MyThread10 implements Runnable {
    Counter c;
    public MyThread10(Counter c) {
        this.c = c;
    }
    public void run() {
        for (int i = 0; i < 100000; i++) c.increment();
    }
}

class MyThread11 implements Runnable {
    Counter c;
    public MyThread11(Counter c) {
        this.c = c;
    }
    public void run() {
        for (int i = 0; i < 100000; i++) c.decrement();
    }
}

public class ThreadSyncTest2 {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(new MyThread10(c));
        Thread t2 = new Thread(new MyThread11(c));
        t1.start(); t2.start(); t1.join(); t2.join();
        System.out.println(c.value());
    }
}
