import java.nio.file.*;
import java.util.*;

public class PathTest {
    public static void main(String[] args) {
        Path path = Paths.get("./ch09 java.nio");
        System.out.println("파일 이름: " + path.getFileName());
        System.out.println("상위 폴더: " + path.getParent().getFileName());
        System.out.println("경로 길이: " + path.getNameCount());

        System.out.print("현재 경로: ");
        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.print(path.getName(i) + "/");
        }

        System.out.print("\n현재 경로: ");
        Iterator<Path> it = path.iterator();
        while (it.hasNext()) {
            System.out.print(it.next().getFileName() + "/");
        }
        System.out.println();
    }
}
