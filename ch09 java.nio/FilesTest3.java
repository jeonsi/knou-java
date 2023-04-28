import java.nio.file.*;

public class FilesTest3 {
    public static void main(String[] args) throws Exception {
        Path source = Paths.get("./ch09 java.nio/FilesTest3.java");
        Path target = Paths.get("./ch09 java.nio/FilesTest3Copy.java");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
