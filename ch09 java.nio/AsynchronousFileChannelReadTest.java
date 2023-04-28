import java.util.concurrent.*;
import java.util.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;
import java.nio.charset.*;

class Data {
    Path path;
    AsynchronousFileChannel file;
    ByteBuffer buffer;
}

public class AsynchronousFileChannelReadTest {
    public static void main(String[] args) throws Exception {
        int procs = Runtime.getRuntime().availableProcessors();
        ExecutorService exec;
        exec = Executors.newFixedThreadPool(procs);
        for (int i = 0; i < 10; i++) {
            Path path = Paths.get("./ch09 java.nio/file" + i + ".txt");
            Files.createDirectories(path.getParent());
            EnumSet<StandardOpenOption> ops;
            ops = EnumSet.of(StandardOpenOption.READ);
            AsynchronousFileChannel file;
            file = AsynchronousFileChannel.open(path, ops, exec);
            ByteBuffer buffer = ByteBuffer.allocate((int)file.size());

            Data data = new Data();
            data.path = path;
            data.file = file;
            data.buffer = buffer;

            CompletionHandler<Integer, Data> handler = new CompletionHandler<Integer, Data>() {
                public void completed(Integer result, Data data) {
                    data.buffer.flip();
                    Charset charset = Charset.defaultCharset();
                    String txt = charset.decode(data.buffer).toString();
                    System.out.print(data.path.getFileName() + ":" + txt);
                    System.out.println(" : " + Thread.currentThread().getName());
                    try {
                        data.file.close();
                    } catch (Exception e) { }
                }
                public void failed(Throwable exec, Data data) {
                    exec.printStackTrace();
                    try {
                        data.file.close();
                    } catch (Exception e) { }
                }
            };

            file.read(buffer, 0, data, handler);
        }
        exec.shutdown();
    }
}
