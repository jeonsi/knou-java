import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Mon", "Monday");
        map.put("Tue", "Tuesday");
        map.put("Wed", "Wednesday");
        map.put("Thu", "Thursday");
        map.put("Fri", "Friday");
        map.put("Sat", "Saturday");
        map.put("Sun", "Sunday");

        System.out.println(map.get("Fri"));
    }
}
