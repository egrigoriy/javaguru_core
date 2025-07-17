package module_2.tasks.strings;

public class Task4 {


    public static void main(String[] args) {
        System.out.println(isValidPalindrome("aba"));
        System.out.println(isValidPalindrome("abca"));
        System.out.println(isValidPalindrome("acba"));
        System.out.println(isValidPalindrome("abc"));
    }

    static boolean isValidPalindrome(String s) {
        String cleanedString = s.replaceAll("[^A-Za-z]", "").toLowerCase();
        int start = 0;
        int end = cleanedString.length() - 1;
        while (start < end) {
           if (cleanedString.charAt(start) != cleanedString.charAt(end)) {
               return isValidPalindrome(cleanedString, start++, end) || isValidPalindrome(cleanedString, start, end--);
           }
           start++;
           end--;
        }
        return true;
    }

    static boolean isValidPalindrome(String s, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
