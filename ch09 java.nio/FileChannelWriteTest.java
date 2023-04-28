import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;
import java.nio.charset.*;

public class FileChannelWriteTest {
    public static void main(String[] args) throws IOException {
        String[] data = {"안녕하세요, 여러분,",
                        "Java 프로그래밍 언어의 세계로 오신 것을 환영합니다.",
                        "JDK를 설치하는 방법에서부터",
                        "Java 프로그램을 compile하고 실행시키는",
                        "모든 방법에 대해 공부해 봅시다."};

        Path path = Paths.get("./ch09 java.nio/file.txt");
        Files.createDirectories(path.getParent());

        FileChannel fileChannel = FileChannel.open(path,
            StandardOpenOption.CREATE, StandardOpenOption.WRITE);

        Charset charset = Charset.defaultCharset();
        ByteBuffer buffer;
        int byteCount = 0;
        for (int i = 0; i <data.length; i++) {
            buffer = charset.encode(data[i]);
            byteCount = fileChannel.write(buffer);
        }
        System.out.println(byteCount);

        fileChannel.close();
    }    
}
