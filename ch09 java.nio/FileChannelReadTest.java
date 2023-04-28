import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;
import java.nio.charset.*;

public class FileChannelReadTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./ch09 java.nio/file.txt");
        FileChannel fileChannel = FileChannel.open(path,
            StandardOpenOption.READ);
        
        ByteBuffer buffer = ByteBuffer.allocate(1024 * 1024);
        Charset charset = Charset.defaultCharset();

        StringBuffer sb = new StringBuffer();
        int byteCount;
        while ((byteCount = fileChannel.read(buffer)) >= 0) {
            buffer.flip();
            sb.append(charset.decode(buffer));
            buffer.clear();
        }
        System.out.println(sb);
        fileChannel.close();
    }
}
