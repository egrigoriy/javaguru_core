package module_7.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.function.Predicate;

public class StreamPeople {
    public static void main(String[] args) {
        Collection<People> people = Arrays.asList(
                new People("Vasya", 16, Sex.M),
                new People("Petya", 23, Sex.M),
                new People("Elena", 42, Sex.F),
                new People("NAdia", 22, Sex.F),
                new People("Ivan Ivanuch", 69, Sex.M)
        );

        Collection<People> vArmiu = people.stream()
                .filter(p -> p.getSex().equals(Sex.M) && p.getAge() >=18 && p.getAge() <= 27)
                .toList();
        System.out.println(vArmiu);

        Predicate<People> isWoman = p -> p.getSex().equals(Sex.F);
        Predicate<People> isMan = p -> p.getSex().equals(Sex.M);

        Double averageMenAge = people.stream()
                .filter(isMan)
                .mapToInt(People::getAge)
                .average()
                .getAsDouble();
        System.out.println(averageMenAge);

        Predicate<People> isWorkingAgeForWoman =  p -> p.getAge() >= 18 && p.getAge() < 55;
        Predicate<People> isWorkingAgeForMen =  p -> p.getAge() >= 18 && p.getAge() < 60;

        Predicate<People> canWomanWork = isWoman.and(isWorkingAgeForWoman);
        Predicate<People> canManWork = isMan.and(isWorkingAgeForMen);

        Collection<People> workers = people.stream().filter(canManWork.or(canWomanWork)).toList();
        System.out.println(workers);

        System.out.println(people.stream().sorted(Comparator.comparingInt(People::getAge)).toList());
    }
}
