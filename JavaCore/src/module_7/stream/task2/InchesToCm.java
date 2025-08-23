package module_7.stream.task2;

import module_3.generics.A;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class InchesToCm {
    public static void main(String[] args) {
        List<Integer> inches = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            inches.add(i);
        }

//        Collection<Double> cms = inches.stream().mapToDouble(i -> i * 2.54);
    }
}
