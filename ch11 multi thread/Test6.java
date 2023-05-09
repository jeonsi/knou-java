class MyThread7 extends Thread {
    Thread thdNext = null;
    public MyThread7(String name) { super(name); }
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000000);
            } catch(InterruptedException e) {
                System.out.print(getName() + " ");
                if (thdNext.isAlive()) thdNext.interrupt();
            }
        }
    }
    public void setNextThread(Thread t) { thdNext = t; }
}

public class Test6 {
    public static void main(String[] args) {
        MyThread7 my_thread1 = new MyThread7("thd1");
        MyThread7 my_thread2 = new MyThread7("thd2");
        MyThread7 my_thread3 = new MyThread7("thd3");
        my_thread1.setNextThread(my_thread2);
        my_thread2.setNextThread(my_thread3);
        my_thread3.setNextThread(my_thread1);
        my_thread1.start();
        my_thread2.start();
        my_thread3.start();
        try {
            my_thread1.interrupt();
            my_thread1.join();
            my_thread2.join();
            my_thread3.join();
        } catch (InterruptedException e) { System.out.println(e); }
        System.out.println("main");
    }
}
