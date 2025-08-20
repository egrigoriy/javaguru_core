package module_5.files.task2;

import module_3.generics.B;

import java.io.*;
import java.util.stream.Stream;

public class FileWithText {
    public static void main(String[] args) {
        String text = "Tu ne quaesieris, scire nefas, quem mihi, quem tibi \n" +
                "finem di dederint, Leuconoe, nec Babylonios temptaris numeros. \n" +
                "ut melius, quidquid erit, pati.";

        String filePath = "C:\\Users\\Competition1\\Documents\\a.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            countWordsAndPunctClassic(br);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void countWordsAndPunctClassic(BufferedReader br) throws IOException {
        String line;
        int wordCounter = 0;
        int punctuationCounter = 0;
        while ((line = br.readLine()) != null) {
            String noPunctuationLine = line.replaceAll("[\\p{P}]", "");
            String onlyPunctuationLine = line.replaceAll("[\\P{P}]", "");
            wordCounter += noPunctuationLine.split(" ").length;
            punctuationCounter += onlyPunctuationLine.length();
        }
        System.out.println("Nbr of words " + wordCounter);
        System.out.println("Nbr of punctuations " + punctuationCounter);
    }

    static int countWords(BufferedReader br) {
        Stream<String> lines = br.lines();
        return lines
                .map(line -> line.replaceAll("[\\p{P}]", ""))
                .mapToInt(line -> line.split("\\s").length)
                .sum();
    }

    static int countPunct(BufferedReader br) {
        Stream<String> lines = br.lines();
        return lines
                .map(line -> line.replaceAll("[\\P{P}]", ""))
                .mapToInt(String::length)
                .sum();
    }
}