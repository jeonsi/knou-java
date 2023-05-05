import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        System.out.println(set.add(new String("one"))); // can't add "one". it is already there. false returns.

        System.out.println(set.size()); // 4
        System.out.println(set.contains("four"));   // true
        System.out.println(set.contains("one"));    // true
        System.out.println(set.contains(new String("one")));    // true

        set.remove("four");
        set.remove(new String("one"));
        System.out.println(set.size()); // 2
        set.clear();    // remove all
        System.out.println(set.size()); // 0
    }
}
