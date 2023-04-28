import java.nio.file.*;

public class FilesTest2 {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("./ch09 java.nio");
        DirectoryStream<Path> ds = Files.newDirectoryStream(path);
        for (Path p : ds) {
            if (Files.isDirectory(p)) {
                System.out.println("[디렉터리] " + p.getFileName());
            } else {
                System.out.print("[파일] " + p.getFileName());
                System.out.println("(" + Files.size(p) + ")");
            }
        }
    }
}
