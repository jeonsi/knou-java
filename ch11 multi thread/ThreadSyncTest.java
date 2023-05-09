class SharedResource {
    int nRes = 0;
    public synchronized void incRes(String name) {
        try {
            Thread.sleep(2);
        } catch (Exception e) { System.out.println(e); }
        nRes++;
        System.out.println("[" + name + " " + nRes + "]");
    }
}

class MyThread8 extends Thread {
    SharedResource sr;
    String name;
    public MyThread8(String name, SharedResource sr) {
        super(name);
        this.name = name;
        this.sr = sr;
    }

    public void run() {
        for (int i = 0; i < 100; i++) sr.incRes(name);
    }
}

public class ThreadSyncTest {
    public static void main(String[] args) {
        SharedResource sr = new SharedResource();
        MyThread8[] thds = new MyThread8[10];
        for (int i = 0; i < thds.length; i++) {
            thds[i] = new MyThread8("thd" + (i + 1), sr);
            thds[i].start();
        }
    }
}
