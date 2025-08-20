package module_4.collections.map.task2;

import java.util.HashMap;
import java.util.Map;

class WordsFrequency {
    public static void main(String[] args) {
        String text = "this is a sample text it contains several words this text is used for testing the word frSequency counter";
        Map<String, Integer> map = new HashMap<>();
        for (String word : text.split(" ")) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (String word : map.keySet()) {
            System.out.println(word + " : " + map.get(word));
        }
    }
}
