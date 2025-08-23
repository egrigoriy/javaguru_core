package module_7.lambda.task1;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<String> predicate1 = s -> s == null;
        Predicate<String> predicate2 = s -> s.isEmpty();

        System.out.println(predicate1.test(null));
        System.out.println(predicate1.test("abc"));
        System.out.println(predicate2.test(""));
        System.out.println(predicate2.test("abc"));

        System.out.println("Test J|N....A");
        Predicate<String> predicate3 = s -> (s.startsWith("J") || s.startsWith("N")) && s.endsWith("A");
        System.out.println(predicate3.test("JOO"));
        System.out.println(predicate3.test("NOO"));
        System.out.println(predicate3.test("JOA"));
        System.out.println(predicate3.test("NOA"));
    }
}
