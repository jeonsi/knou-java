import java.util.*;

public class LinkedListTest2 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        // for search
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // foreach search, Iterable search
        for (String s : list) {
            System.out.println(s);
        }

        // Iterator search
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
