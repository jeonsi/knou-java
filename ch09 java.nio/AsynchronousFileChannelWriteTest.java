import java.util.concurrent.*;
import java.util.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;
import java.nio.charset.*;

class Data {
    Path path;
    AsynchronousFileChannel file;
}

public class AsynchronousFileChannelWriteTest {
    public static void main(String[] args) throws Exception {
        int procs = Runtime.getRuntime().availableProcessors();
        ExecutorService exec;
        exec = Executors.newFixedThreadPool(procs);
        for (int i = 0; i < 10; i++) {
            Path path = Paths.get("./ch09 java.nio/file" + i + ".txt");
            Files.createDirectories(path.getParent());
            EnumSet<StandardOpenOption> ops;
            ops = EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            AsynchronousFileChannel file;
            file = AsynchronousFileChannel.open(path, ops, exec);

            Data data = new Data();
            data.path = path;
            data.file = file;

            Charset charset = Charset.defaultCharset();
            ByteBuffer buffer = charset.encode("안녕하세요.");

            CompletionHandler<Integer, Data> handler = new CompletionHandler<Integer, Data>() {
                public void completed(Integer result, Data data) {
                    System.out.println(data.path.getFileName() + ":" + result);
                    System.out.println(" bytes written: " + Thread.currentThread().getName());
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

            file.write(buffer, 0, data, handler);
        }
        exec.shutdown();
    }
}
