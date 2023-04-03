public class ArrayTest4 {
    public static void main(String[] args) {
        int anArray1[] = new int[5];
        for(int i = 0; i < anArray1.length; i++) {
            anArray1[i] = i;
        }
        int anArray2[][] = new int[2][3];
        for(int i = 0; i < anArray2.length; i++)
            for(int j = 0; j < anArray2[i].length; j++)
                anArray2[i][j] = i;
    }
}
