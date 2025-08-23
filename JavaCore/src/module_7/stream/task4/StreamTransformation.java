package module_7.stream.task4;

import java.util.Collection;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTransformation {
    public static void main(String[] args) {
        Random random = new Random();
        Collection<String> result = Stream.iterate(1, (n) -> random.nextInt( 10))
                .limit(100)
                .map(String::valueOf)
                .collect(Collectors.toSet());
        System.out.println(result);
    }

}
