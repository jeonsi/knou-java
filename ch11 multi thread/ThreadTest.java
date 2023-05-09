class MyThread extends Thread {
    public void run() {
        System.out.println("Thread");
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        MyThread my_thread = new MyThread();
        my_thread.start();
    }    
}
