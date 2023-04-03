public class MultipleType {
    public static void main(String[] args) {
        Pair<String, Integer> p1;
        p1 = new OrderedPair<>("Even", 8);
        Pair<String, String> p2;
        p2 = new OrderedPair<>("hello", "java");
        System.out.println(p1.getKey());
        System.out.println(p1.getValue());
        System.out.println(p2.getKey());
        System.out.println(p2.getValue());

        Pair<String, Data<Integer>> p3;
        p3 = new OrderedPair<>("Even", new Data<Integer>(8));
        System.out.println(p3.getKey());
        System.out.println(p3.getValue().get());
    }
}

interface Pair<K, V> {
    K getKey();
    V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {return key;}
    public V getValue() {return value;}
    public void setKey(K key) {this.key = key;}
    public void setValue(V value) {this.value = value;}
}
