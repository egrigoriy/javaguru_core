package module_5.files;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File f = new File("test.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
