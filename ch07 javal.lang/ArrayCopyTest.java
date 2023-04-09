public class ArrayCopyTest {
    public static void main(String[] args) {
        int src[] = {1, 2, 3, 4, 5};
        int dst[] = new int[src.length];
        System.arraycopy(src, 0, dst, 0, src.length);
        for (int i : dst) System.out.println(i);
    }
}
