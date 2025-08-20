package module_4.sorting.tasks.task2;

import java.util.Comparator;
import java.util.Map;

public class SortByValueComparator implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o1.getValue() - o2.getValue();
    }
}
