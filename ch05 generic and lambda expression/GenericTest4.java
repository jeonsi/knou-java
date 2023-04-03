class GenericTest4 {
    public static void main(String[] args) {
        OrderedPair<Integer, String> p1 = new OrderedPair<>(1, "apple");
        OrderedPair<Integer, String> p2 = new OrderedPair<>(2, "pear");
        boolean same = Util.<Integer, String>compare(p1, p2);
                same = Util.compare(p1, p2);    // 인자에 의해 추론이 가능하면 타입매개변수는 생략가능
        System.out.println(same);
    }
}

class Util {
    public static <K, V> boolean compare(OrderedPair<K, V> p1, OrderedPair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
            p1.getValue().equals(p2.getValue());
    }
}