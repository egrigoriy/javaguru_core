package module_4.collections.tasks.task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println(list);
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
    }
}
