import java.nio.*;
import java.nio.charset.*;

public class TransformTest {
    public static void main(String[] args) {
        String[] data = {"안녕하세요, 여러분,",
                        "Java 프로그래밍 언어의 세계로 오신 것을 환영합니다.",
                        "JDK를 설치하는 방법에서부터",
                        "Java 프로그램을 compile하고 실행시키는",
                        "모든 방법에 대해 공부해 봅시다."};

        Charset cs = Charset.defaultCharset();
        ByteBuffer buffer;
        for (int i = 0; i < data.length; i++) {
            buffer = cs.encode(data[i]);
            System.out.println(cs.decode(buffer));
        }
    }
}
