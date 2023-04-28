import java.util.*;
import java.nio.*;

public class TransformTest3 {
    public static void main(String[] args) {
        int[] src = {10, 20, 30, 40};
        int[] dst;
        
        System.out.println(Arrays.toString(src));
        ByteBuffer bBuffer;
        IntBuffer isrcBuffer, idstBuffer;

        isrcBuffer = IntBuffer.wrap(src);
        bBuffer = ByteBuffer.allocate(isrcBuffer.capacity()*4);

        for (int i = 0; i <isrcBuffer.capacity(); i++) {
            bBuffer.putInt(isrcBuffer.get(i));
        }

        bBuffer.flip();

        idstBuffer = bBuffer.asIntBuffer();
        dst = new int[idstBuffer.capacity()];
        for (int i = 0; i < dst.length; i++) {
            dst[i] = idstBuffer.get();
        }

        System.out.println(Arrays.toString(dst));
    }
}
