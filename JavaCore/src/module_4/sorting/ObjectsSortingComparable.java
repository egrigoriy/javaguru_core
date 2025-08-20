package module_4.sorting;

import java.util.List;
import java.util.TreeSet;

public class ObjectsSortingComparable {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("Peter", 12),
                new Person("Ivan", 21),
                new Person("Alexandr", 4)
        );
        TreeSet<Person> treeSet = new TreeSet<>(list);
        System.out.println(treeSet);
    }
}
