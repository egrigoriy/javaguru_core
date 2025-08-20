package module_4.collections.map.task3;

import java.util.HashMap;
import java.util.Map;

class SymbolsFrequency {
    public static void main(String[] args) {
        String text = "baaccc";
        Map<Character, Integer> frequencyMap = getCharsCount(text);
        for (Character c : frequencyMap.keySet()) {
            System.out.println(c + " : " + frequencyMap.get(c));
        }
    }

    private static Map<Character, Integer> getCharsCount(String text) {
        Map<Character, Integer> result = new HashMap<>();
        char[] chars = text.toCharArray();
        for (char c : chars) {
            result.put(c, result.getOrDefault(c, 0) + 1);
        }
        return result;
    }
}
