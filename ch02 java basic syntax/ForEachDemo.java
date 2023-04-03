public class ForEachDemo {
    public static void main(String[] args) {
        int[] arrayOfInts = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};

        // 형식: for(변수선언 : 배열) { 문장; ... }
        for(int element : arrayOfInts) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
