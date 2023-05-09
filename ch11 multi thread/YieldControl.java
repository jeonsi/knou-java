class MyThread5 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            String thd_name = Thread.currentThread().getName();
            System.out.print(thd_name + " ");
            if (thd_name.equals("thd1")) Thread.yield();
        }
    }
}
public class YieldControl {
    public static void main(String[] args) {
        Thread my_thread1 = new Thread(new MyThread5(), "thd1");
        Thread my_thread2 = new Thread(new MyThread5(), "thd2");
        my_thread1.start();
        my_thread2.start();
    }
}
