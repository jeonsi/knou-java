class TV {
    private int nSize = 0;
    static private int price = 10;
    static {
        price = 20;
    }
    public TV(int nNewSize) {
        nSize = nNewSize;
        System.out.println("TV(int) 생성자 호출됨");
        price = 30;
    }
    public TV() {
        nSize = 20;
        System.out.println("TV() 생성자 호출됨");
        price = 40;
    }
}

public class Test {
    public static void main(String[] args) {
        TV tv1 = new TV(10);
        TV tv2 = new TV();
    }
}
