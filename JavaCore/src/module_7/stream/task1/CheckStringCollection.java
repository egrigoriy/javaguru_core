package module_7.stream.task1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckStringCollection {
    public static void main(String[] args) {
        Collection<String> col = List.of("a", "login", "voo", "hello worlds", "hi, peter!", "a");
        Collection<String> col2 = List.of("a", "voo", "hello worlds", "hi, peter!", "a");

        // does contain "login"
        System.out.println("col contains login: " + col.stream().filter("login"::equals).findAny().isPresent());
        System.out.println("col2 contains login: " + col2.stream().filter("login"::equals).findAny().isPresent());

        // longest
        String longest = col.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(longest);
        // shortest
        String shortest = col.stream().min(Comparator.comparingInt(String::length)).get();
        System.out.println(shortest);

       // single word
        System.out.println("initial: " + col);
        Collection<String> singleWords = col.stream()
                .filter(s -> s.matches("[\\w]+"))
                .collect(Collectors.toSet());
        System.out.print("Single words: ");
        System.out.println(singleWords);
        // get all used words
        Collection<String> allWords = col.stream()
                .map(s -> s.replaceAll("[\\p{P}]", ""))
                .flatMap(s -> Stream.of(s.split(" ")))
                .collect(Collectors.toSet());
        System.out.println("All words: " + allWords);
    }
}
