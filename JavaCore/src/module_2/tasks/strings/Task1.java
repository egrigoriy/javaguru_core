package module_2.tasks.strings;

public class Task1 {
    public static void main(String[] args) {
        String s = "I like Java!!!";
        printLastChar(s);
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.replaceAll("a", "o"));
        int index = s.indexOf("Java");
        System.out.println(s.substring(index, index + "Java".length()));
    }

    static void printLastChar(String s) {
        System.out.println(s.charAt(s.length() - 1));
    }
}
