package module_5.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("c:/a.txt");
            System.out.println("I am learning exceptions");
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Hello from FINALLY");
        }
    }
}
