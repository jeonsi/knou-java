import java.nio.file.*;

public class FileSystemTest {
    public static void main(String[] args) throws Exception {
        FileSystem fs = FileSystems.getDefault();
        for (FileStore store : fs.getFileStores()) {
            System.out.println("드라이브 이름: " + store.name());
            System.out.println("파일 시스템: " + store.type());
            long total = store.getTotalSpace();
            long free = store.getUnallocatedSpace();
            System.out.println("전체 공간: " + total/1000000000 + "GB");
            System.out.println("사용 중인 공간: " + (total - free)/1000000000 + "GB");
            System.out.println("사용 가능한 공간: " + free/1000000000 + "GB");
        }
    }
}
