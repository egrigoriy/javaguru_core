package module_7.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaAsParameterDemo {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6};
        Expression isEven = n -> n % 2 == 0;
        System.out.println(sum(ints, isEven));

        System.out.println(sum(ints, n -> n > 3));
    }

    private static int sum(int[] ints, Expression isEven) {
        return Arrays.stream(ints)
                .filter(isEven::isTrue)
                .sum();
    }


}

@FunctionalInterface
interface Expression {
   boolean isTrue(int n);
}
