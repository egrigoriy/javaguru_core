package module_2;

import java.util.Arrays;

public class StringsDemo {
    public static void main(String[] args) {
        String s = "Hello World";
        char[] as = s.toCharArray();
        System.out.println(Arrays.toString(as));
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        System.out.println();
        System.out.println(s.substring(0, 4));
        System.out.println(s.substring(4));
    }
}
