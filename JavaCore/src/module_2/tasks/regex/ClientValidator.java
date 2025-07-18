package module_2.tasks.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClientValidator {
    boolean validateEmail(String email){
        String login = "^(?<login>[\\w_\\-.]+)";
        String at = "@";
        String subdomain = "(?<subdomain>[A-Za-z]{2,6})";
        String dot = "[.]";
        String domain = "(?<domain>ru|com|net|org)";

        Pattern pattern = Pattern.compile(login + at + subdomain + dot + domain);
        Matcher matcher = pattern.matcher(email);
        matcher.find();
        return !matcher.group("login").isEmpty() &&
                !matcher.group("subdomain").isEmpty() &&
                !matcher.group("domain").isEmpty();
    }

    boolean validateIP(String ip) {
        String group1 = "^(?<group1>[\\d]{1,3})";
        String group2 = "(?<group2>[\\d]{1,3})";
        String group3 = "(?<group3>[\\d]{1,3})";
        String group4 = "(?<group4>[\\d]{1,3})$";
        String dot = "[.]";
        Pattern pattern = Pattern.compile(group1 + dot + group2 + dot + group3 + dot + group4);
        Matcher matcher = pattern.matcher(ip);
        matcher.find();
        if (matcher.group("group1").isEmpty() ||
                matcher.group("group2").isEmpty() ||
                matcher.group("group3").isEmpty() ||
                matcher.group("group4").isEmpty()) {
            return false;
        }
        if (Integer.parseInt(matcher.group("group1")) > 255 ||
                Integer.parseInt(matcher.group("group2")) > 255 ||
                Integer.parseInt(matcher.group("group3")) > 255 ||
                Integer.parseInt(matcher.group("group4")) > 255) {
            return false;
        }
        return true;
    }

    boolean validateUrl(String url) {
        String protocol = "^(http|https):\\/\\/";
        String subdomain = "www";
        String dot = "[.]";
        String rootDomain = "[A-Za-z-_]+";
        String domain = "ru|com|net|org";
        String path = ".";
        String slug = "[^ ]+";
        Pattern pattern = Pattern.compile(protocol + subdomain + dot + rootDomain + dot + domain + path);
        Matcher matcher = pattern.matcher(url);
        matcher.find();
        System.out.println(url);
        System.out.println(matcher.group());
        return false;
    }

    boolean validateAddress(String address){
        return false;
    }
}
