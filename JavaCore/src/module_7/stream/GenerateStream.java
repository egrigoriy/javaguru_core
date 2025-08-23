package module_7.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class GenerateStream {
    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.of(1, 2, 33, 5);
        System.out.println(s1.collect(Collectors.toSet()));

        int[] ints = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.stream(ints).filter(n -> n > 0).count());

        Stream<Integer> s2 = Stream.of(1, 2, 33, 5);
        System.out.println(s2.skip(2).toList());


        Stream<Integer> s3 = Stream.of(1, 2, 33, 5);
        System.out.println(s3.mapToInt(s -> s).sum());
    }
}
