package module_5.files;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File f = new File("C:/");
        File[] paths = f.listFiles();
        for (File path : paths) {
            System.out.println(path.getName());
        }
    }
}
