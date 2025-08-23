package module_7.lambda;

import java.util.Arrays;
import java.util.List;

public class ArraysComparator {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10, 2, 30, 4);
        System.out.println(arr);
        arr.sort(Integer::compareTo);
        System.out.println(arr);
        arr.sort((x, y) -> y - x);
        System.out.println(arr);
    }
}
