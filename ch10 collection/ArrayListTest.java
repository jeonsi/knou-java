import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add(1, "one");
        list.add("five");
        System.out.println(list.size());    // 5
        System.out.println(list.indexOf("one"));    // 0
        System.out.println(list.get(2));    // "two"
        System.out.println(list.lastIndexOf("one"));    // 1
        System.out.println(list.set(3, "four"));    // return old value, three
        System.out.println(list.remove(4));     // return old value, five
        System.out.println(list.remove("one")); // success, return true
    }
}
