package module_5.files;

import java.io.File;
import java.io.IOException;

public class GenerateFileAndListThem {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Competition1\\Documents\\test");
        dir.mkdir();
        File file;
        for (int i = 0; i < 10; i++) {
            try {
                file = new File(dir, "test" + i + ".txt");
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        File[] files = dir.listFiles();
        for (File f : files) {
            System.out.println(f.getName());
        }
        dir.delete();
    }
}
