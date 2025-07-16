package module_2;

import java.util.Arrays;
import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your login:");
        String login = scanner.nextLine();
        String formattedLogin = getFormatLogin(login);
        System.out.println(formattedLogin);
        System.out.println(replaceSecondWord(formattedLogin, "Petrov"));
    }

    static String getFormatLogin(String str) {
        return str.trim().toLowerCase();
    }

    static String replaceSecondWord(String str1, String str2) {
        String[] ss = str1.split(" ");
        if (str2.equals(ss[1])) {
            return "No need to replace";
        }
        ss[1] = str2;
        return String.join(" ", ss);
    }
}
