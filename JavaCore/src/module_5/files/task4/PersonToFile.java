package module_5.files.task4;

import java.io.*;
import java.util.List;

public class PersonToFile {
    public static void main(String[] args) {
        String rootPath = "C:\\Users\\Competition1\\Documents";
        File file = new File(rootPath + "\\persons.txt");
        List<Person> persons = List.of(
                new Person("Ivan", "Ivanuch", 23),
                new Person("Peter", "Petrovich", 12),
                new Person("Sidor", "Sidorovich", 55)
        );

        writeObjects(file, persons);
        readObjects(file);
    }

    private static void readObjects(File file) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    System.out.println(inputStream.readObject());
                } catch (EOFException eofException) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeObjects(File file, List<Person> persons) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))){
            for (Person person : persons) {
                outputStream.writeObject(person);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
