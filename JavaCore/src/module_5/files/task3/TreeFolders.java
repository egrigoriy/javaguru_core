package module_5.files.task3;

import java.io.*;
import java.util.Random;

public class TreeFolders {
    public static void main(String[] args) {
        String rootPath = "C:\\Users\\Competition1\\Documents";
        String folder1path = rootPath + "\\folder1";
        String folder2path = folder1path + "\\folder2";
        String folder3path = folder2path + "\\folder3";

        File lastFolder = new File(folder3path);
        lastFolder.mkdirs();
        // create 5 files
        create5Files(folder3path);
        // collect all files to single one
        writeAllFilesContent(folder3path);
        // create file with folder content
        writeFolderContent(folder3path);
    }

    private static void writeFolderContent(String folderPath) {
        String folderContent = getFolderContent(folderPath);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(folderPath + "\\content.txt"))) {
            bufferedWriter.write(folderContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String getFolderContent(String folderPath) {
        File folder = new File(folderPath);
        String folderContent = "";
        for (File file : folder.listFiles()) {
            folderContent += file.getName() + "\n";
        }
        return folderContent;
    }

    private static void writeAllFilesContent(String folder3path) {
        String collectedContent = getAllFilesContent(new File(folder3path));
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(folder3path + "\\total.txt"))) {
           bufferedWriter.write(collectedContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String getAllFilesContent(File lastFolder) {
        String collectedContent = "";
        for (File file : lastFolder.listFiles()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    collectedContent += line + "\n";
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return collectedContent;
    }

    private static void create5Files(String folder3path) {
        for (int i = 0; i < 5; i++) {
            writeRandomsToFile(folder3path, i);
        }
    }

    private static void writeRandomsToFile(String folder3path, int i) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(folder3path + "\\foo" + i + ".txt"))) {
            Random random = new Random();
            for (int j = 0; j < 10; j++) {
                bw.write(random.nextInt(100) + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
