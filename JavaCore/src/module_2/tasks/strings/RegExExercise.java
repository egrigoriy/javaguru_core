package module_2.tasks.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your phrase:");
        String s = scanner.nextLine();
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(s);
        String biggestSeq = "";
        while (matcher.find()) {
            if (matcher.group().length() > biggestSeq.length()) {
                biggestSeq = matcher.group();
            }
        }
        System.out.println("Biggest: " + biggestSeq);
        System.out.println("It's size is: " + biggestSeq.length());
    }
}
