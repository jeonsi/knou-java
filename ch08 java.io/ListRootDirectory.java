import java.io.*;

public class ListRootDirectory {
    public static void main(String[] args) {
        File root_files[] = File.listRoots();
        int i = 0;
        File dir_files[];
        while (i < root_files.length) {
            System.out.println(root_files[i].getPath());
            dir_files = root_files[i].listFiles();
            int j = 0;
            if (dir_files == null) {
                System.out.println("\t*EMPTY");
            } else {
                while (j < dir_files.length) {
                    if (dir_files[j].isDirectory()) {
                        System.out.print("\t" + "[");
                        System.out.println(dir_files[j].getName() + "]");
                    } else {
                        System.out.println("\t" + dir_files[j].getName());
                    }
                    j++;
                }
            }
            i++;
        }
    }
}
