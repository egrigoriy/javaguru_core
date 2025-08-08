package module_4.collections;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            list.add(random.nextInt(20));
        }
        System.out.println(list);
        System.out.println();
        Iterator<Integer> iterator = list.iterator();
        TreeSet<Integer> result = new TreeSet<>();
        while (iterator.hasNext()) {
            int next = iterator.next();
            if (next % 2 != 0) {
                result.add(next);
            }
        }
        System.out.println(result);
    }
}
