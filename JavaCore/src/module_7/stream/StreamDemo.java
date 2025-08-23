package module_7.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        Collection<String> arr = Arrays.asList("a1", "a2", "a3", "a1");

        long countA1 = arr.stream().filter("a1"::equals).count();
        System.out.println(countA1);

        System.out.println(arr.stream().findFirst().orElse("0"));

        System.out.println(arr.stream().skip(arr.size() - 1).findFirst().orElse("empty"));

        System.out.println(arr.stream().filter("a3"::equals).findFirst().get());

        System.out.println(arr.stream().skip(2).findFirst().get());

        System.out.println(arr.stream().skip(1).limit(2).collect(Collectors.toList()));
    }
}
