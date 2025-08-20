package module_4.sorting;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ObjectSortingComparator {
    public static void main(String[] args) {
        Comparator<Student> scomparator = new StudentNameComparatorASC().thenComparing(new StudentAgeComparator());
        List<Student> students = List.of(
                new Student("Alexander", 32),
                new Student("Alexander", 12),
                new Student("Sidor", 12),
                new Student("Ivan", 40),
                new Student("Ivan", 44)
        );
        TreeSet<Student> studentTreeSet = new TreeSet<>(new StudentNameComparatorASC());
        studentTreeSet.addAll(students);
        System.out.println(studentTreeSet);
        System.out.println();
        TreeSet<Student> studentTreeSet1 = new TreeSet<>(new StudentNameComparatorDSC());
        studentTreeSet1.addAll(students);
        System.out.println(studentTreeSet1);
        System.out.println();
        TreeSet<Student> studentTreeSet2 = new TreeSet<>(new StudentAgeComparator());
        studentTreeSet2.addAll(students);
        System.out.println(studentTreeSet2);

        System.out.println();
        TreeSet<Student> studentTreeSet3 = new TreeSet<>(scomparator);
        studentTreeSet3.addAll(students);
        System.out.println(studentTreeSet3);

    }
}
