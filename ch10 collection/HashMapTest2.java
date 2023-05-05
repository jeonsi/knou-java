import java.util.*;

public class HashMapTest2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Map<String, Integer> lectures;
        Map<String, Map<String, Integer>> scores = new HashMap<>();

        names.add("김철수");
        names.add("이영희");

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.equals("김철수")) {
                lectures = new HashMap<>();
                lectures.put("국어", 100);
                lectures.put("영어", 95);
                lectures.put("수학", 80);
                scores.put(name, lectures);
            }
            if (name.equals("이영희")) {
                lectures = new HashMap<>();
                lectures.put("국어", 90);
                lectures.put("영어", 95);
                lectures.put("수학", 95);
                scores.put(name, lectures);
            }
        }

        for (String name : scores.keySet()) {
            System.out.print("국어: ");
            System.out.println(scores.get(name).get("국어"));
            System.out.print("영어: ");
            System.out.println(scores.get(name).get("영어"));
            System.out.print("수학: ");
            System.out.println(scores.get(name).get("수학"));
            System.out.println();
        }
    }
}
