package module_4.sorting;

import java.util.List;
import java.util.TreeSet;

public class DefaultSorting {
    public static void main(String[] args) {
        List<String> list = List.of("b", "z", "a");
        TreeSet<String> treeSet = new TreeSet<>(list);
        System.out.println(treeSet);
    }
}
