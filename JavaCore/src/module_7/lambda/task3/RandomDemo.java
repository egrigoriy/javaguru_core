package module_7.lambda.task3;

import java.util.Random;
import java.util.function.Supplier;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> supplier = () -> random.nextInt(10);

        for (int i = 0; i < 10; i++) {
            System.out.println(supplier.get());
        }
    }
}
