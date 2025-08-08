package module_4.collections.tasks.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> marks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            marks.add(random.nextInt(2, 6));
        }
        System.out.println(marks);
        System.out.println();

        Iterator<Integer> iterator = marks.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 3) {
                iterator.remove();
            }
        }

        System.out.println(marks);
        iterator = marks.iterator();
        int maxMark = Integer.MIN_VALUE;
        while (iterator.hasNext()) {
            int next = iterator.next();
            if (next > maxMark) {
                maxMark = next;
            }
        }
        System.out.println(maxMark);
    }
}
