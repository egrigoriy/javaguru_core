package module_4.sorting.tasks.task2;

import java.util.Map;
import java.util.TreeMap;

public class SortMapByValueDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
            "two", 2,
                "five", 5,
                "three", 3,
                "one", 1,
                "four", 4
        );
        System.out.println(map);
        Map<String, Integer> sortedMap = sortByValue(map);
        System.out.println(sortedMap);
    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        return null;
    }

}
