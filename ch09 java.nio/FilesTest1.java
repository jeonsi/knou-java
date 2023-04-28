import java.nio.file.*;

public class FilesTest1 {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("./ch09 java.nio/FilesTest1.java");
        System.out.println("./ch09 java.nio/FilesTest1.java");
        if (Files.isDirectory(path)) System.out.println("디렉터리입니다.");
        if (Files.isRegularFile(path)) System.out.println("일반파일입니다.");
        System.out.println("크기: " + Files.size(path));
        System.out.println("소유자: " + Files.getOwner(path).getName());
        if (Files.isHidden(path)) System.out.println("숨김파일입니다.");
        if (Files.isReadable(path)) System.out.println("읽기가능합니다.");
        if (Files.isWritable(path)) System.out.println("수정가능합니다.");
        System.out.println("최종수정시간: " + Files.getLastModifiedTime(path));
    }
}
