package module_7.lambda;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class SumEvensOdds {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6};
        System.out.println(sum(ints, n -> n % 2 == 0));
        System.out.println(sum(ints, n -> n % 2 != 0));
    }

    private static int sum(int[] ints, Predicate<Integer> predicate) {
        return Arrays.stream(ints)
                .filter(predicate::test)
                .sum();
    }
}

@FunctionalInterface
interface MyFilter<T> {
    boolean test(T o);
}
