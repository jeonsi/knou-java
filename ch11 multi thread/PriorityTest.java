class MyThread4 extends Thread {
    public MyThread4(String name) { super(name); }
    public void run() {
        for (int i = 0; i < 100; i++) {
            String num;
            if (i < 10) num = "0" + String.valueOf(i);
            else num = String.valueOf(i);
            System.out.println(getName() + "(" + num + ")");
        }
    }
}
public class PriorityTest {
    public static void main(String[] args) {
        MyThread4 my_thread1 = new MyThread4("thd1");
        MyThread4 my_thread2 = new MyThread4("thd2");
        MyThread4 my_thread3 = new MyThread4("thd3");
        my_thread1.setPriority(Thread.MIN_PRIORITY);
        my_thread2.setPriority(Thread.NORM_PRIORITY);
        my_thread3.setPriority(Thread.MAX_PRIORITY);
        my_thread1.start();
        my_thread2.start();
        my_thread3.start();
    }
}
