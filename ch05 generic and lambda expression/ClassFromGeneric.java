class ClassFromGeneric {
    public static void main(String[] args) {
        MyPair mp = new MyPair("test", 1);
        System.out.println(mp.getKey());
        System.out.println(mp.getValue());

        MyData md = new MyData(10);
        System.out.println(md.get());
    }
}

class MyPair implements Pair<String, Integer> {
    private String key;
    private Integer value;

    MyPair(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {return key;}
    public Integer getValue() {return value;}
}

class MyData extends Data<Integer> {
    MyData(Integer i) {super(i);}
}