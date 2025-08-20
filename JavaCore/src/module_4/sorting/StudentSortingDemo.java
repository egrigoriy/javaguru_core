package module_4.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentSortingDemo {
    public static void main(String[] args) {
        Comparator<Student> scomparator = new StudentNameComparatorASC().thenComparing(new StudentAgeComparator());
        List<Student> students = Arrays.asList(
                new Student("Alexander", 32),
                new Student("Alexander", 12),
                new Student("Sidor", 12),
                new Student("Ivan", 40),
                new Student("Ivan", 44)
        );
        students.sort(scomparator);
        System.out.println(students);
        students.sort(new StudentAgeComparator());
        System.out.println(students);
        students.sort(new StudentNameComparatorASC());
        System.out.println(students);
    }
}
