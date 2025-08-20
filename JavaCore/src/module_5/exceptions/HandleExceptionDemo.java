package module_5.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class HandleExceptionDemo {
    public static void main(String[] args) {
        try {
            readFileV2();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        readFileV1();
    }

    private static void readFileV1() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("c:/a.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    private static void readFileV2() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("c:/a.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
