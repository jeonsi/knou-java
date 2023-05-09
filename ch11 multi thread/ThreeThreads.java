class MyThread3 extends Thread {
    public MyThread3(String name) { super(name); }
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + " ");
        }
    }
}

public class ThreeThreads {
    public static void main(String[] args) {
        MyThread3 my_thread1 = new MyThread3("thd1");
        MyThread3 my_thread2 = new MyThread3("thd2");
        MyThread3 my_thread3 = new MyThread3("thd3");
        my_thread1.start();
        my_thread2.start();
        my_thread3.start();
        System.out.println("main");
    }
}
