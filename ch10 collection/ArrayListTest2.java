import java.util.*;
import java.util.function.Consumer;

public class ArrayListTest2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

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

        // Iterable with Consumer: anonymous class
        Consumer<String> con1 = new Consumer<>() {
            public void accept(String t) {
                System.out.println(t);
            }
        };
        list.forEach(con1);

        // Iterable with Consumer: lambda expression
        Consumer<String> con2 = t -> System.out.println(t);
        list.forEach(con2);

        // Iterable with Consumer: lambda expression
        list.forEach(t -> System.out.println(t));
    }
}
