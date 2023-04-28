import java.nio.*;

public class BufferAllocateTest {
    public static void main(String[] args) {
        int c = 1024 * 1024 * 1024;
        Buffer buffer = ByteBuffer.allocate(c);
        System.out.println(c + " bytes buffer is created.");

        ByteBuffer buffer_direct = ByteBuffer.allocateDirect(c);
        buffer_direct.order(ByteOrder.nativeOrder());
        System.out.println(c + " bytes direct buffer is created.");

        byte[] barray = new byte[100];
        Buffer bbuffer = ByteBuffer.wrap(barray);

        char[] carray = new char[100];
        Buffer cbuffer = CharBuffer.wrap(carray, 0, 50);
    }
}
