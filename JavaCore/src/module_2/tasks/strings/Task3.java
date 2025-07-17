package module_2.tasks.strings;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Hello"));
        System.out.println(isPalindrome("A dog! A panic in a pagoda!"));
        System.out.println(isPalindrome("A man, a plan, a canal – Panama!"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("race a car"));
    }

    static boolean isPalindrome(String s) {
        String cleanedString = s.replaceAll("[^A-Za-z]", "").toLowerCase();
        for (int i = 0; i < cleanedString.length()/2; i++) {
            if (cleanedString.charAt(i) != cleanedString.charAt(cleanedString.length() - 1 - i)) {
                return false;
            }
        }
       return true;
    }
}
