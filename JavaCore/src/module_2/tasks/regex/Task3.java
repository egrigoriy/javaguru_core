package module_2.tasks.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your phrase:");
        String s = scanner.nextLine();
        Pattern pattern = Pattern.compile("[^ ]+");
        Matcher matcher = pattern.matcher(s);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            String word = matcher.group();
            result.append(word.substring(word.length() - 1));
        }
        System.out.println(result);
    }
}
