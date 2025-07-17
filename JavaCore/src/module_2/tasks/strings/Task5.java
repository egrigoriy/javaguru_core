package module_2.tasks.strings;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(extract2Middles("string"));
        System.out.println(extract2Middles("code"));
        System.out.println(extract2Middles("Practice"));
    }

    static String extract2Middles(String s) {
        int middle = s.length() / 2;
        return s.substring(middle - 1, middle + 1);
    }
}
