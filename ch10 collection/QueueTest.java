import java.util.*;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");

        String s = queue.poll();
        while(s != null) {
            System.out.println(s);
            s = queue.poll();
        }
    }
}
