package module_7.lambda.task2;

import java.util.function.Function;

public class SignDemo {
    public static void main(String[] args) {
        Function<Integer, String> fun = n -> {
            if (n > 0) return "Is positive";
            if (n < 0) return "Is negative";
            else return "Is zero";
        };

        System.out.println(fun.apply(-10));
        System.out.println(fun.apply(10));
        System.out.println(fun.apply(0));
    }
}
