package module_7.lambda;

import module_3.generics.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaAsReturn {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            arr.add(i);
        }
        Foo fun = bar(arr.size());
        System.out.println(fun.apply(arr));
    }

    static Foo bar(int size) {
        if (size > 20) {
            return a -> a.stream()
                    .reduce(0, Integer::sum)
                    .toString();
        }
        if (size > 10) {
            return z -> z.stream()
                    .map(String::valueOf)
                    .reduce("", (a, b) -> a + b);
        }
        return zaz -> zaz.stream()
                .reduce(1, (x, y) -> x * y)
                .toString();
    }

}

@FunctionalInterface
interface Foo {
    String apply(List<Integer> list);
}
