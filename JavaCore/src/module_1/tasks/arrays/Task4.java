package module_1.tasks.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        int[] a = { 99, 1, 2, 99, 3, 2, 2, 4, 5, 1, 2, 5};
        Set<Integer> set = new HashSet<>();
        for (int i : a) {
            set.add(i);
        }
        System.out.println(set);
    }
}
