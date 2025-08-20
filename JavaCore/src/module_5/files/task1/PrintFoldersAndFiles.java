package module_5.files.task1;

import module_3.generics.A;

import java.io.File;
import java.util.Arrays;

public class PrintFoldersAndFiles {
    public static void main(String[] args) {
        File rootDir = new File("C:\\Users\\Competition1\\Documents");
        printDirsAndFiles(rootDir, 0);
    }

    static void printDirsAndFiles(File dir, int space) {
        if (dir.listFiles() == null) return;
        Arrays.stream(dir.listFiles(File::isFile))
                .forEach(file -> System.out.println(" ".repeat(space) + file.getName()));
        Arrays.stream(dir.listFiles(File::isDirectory))
                .forEach(folder -> {
                    System.out.println(" ".repeat(space) + folder.getName());
                    printDirsAndFiles(folder, space + 4);
                });
    }
}
