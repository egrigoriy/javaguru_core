package module_2.tasks.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args) {
        System.out.println("20934".matches("[0-9]+"));
        System.out.println("20934".matches("[0-9][0-9][0-9][0-9][0-9]"));
        System.out.println("20934".matches("[0-9][0-9][0-9]"));
        System.out.println();

        String s = "Test -string       -test";
        Pattern pattern = Pattern.compile(" +-+");
        Matcher matcher = pattern.matcher(s);
        while(matcher.find()) {
            System.out.println(matcher.start());
            System.out.println(s.substring(0, matcher.start()));
            System.out.println(matcher.end());
            System.out.println(matcher.group());
        }

    }
}
