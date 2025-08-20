package module_4.sorting.tasks.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class StudentSortingDemo {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ivan", "12A", 3.01),
                new Student("Peter", "13A", 2.99),
                new Student("Niko", "15A", 4.01),
                new Student("Miro", "12A", 4.23),
                new Student("Kiro", "11A", 4.55),
                new Student("Koko", "11A", 4.05),
                new Student("Ivan", "11A", 2.55)
        );
        System.out.println("Initial list:");
        System.out.println(students);
        System.out.println("Removed bellow average 3");
        List<Student> goodStudents = removeBellowAverage3(students);
        System.out.println(goodStudents)    ;
        System.out.println("Sort by name:");
        goodStudents.sort(new StudentNameComparator());
        System.out.println(goodStudents);
        System.out.println("Sort by group:");
        goodStudents.sort(new StudentGroupComparator());
        System.out.println(goodStudents);
        System.out.println("Sort by average");
        goodStudents.sort(new StudentAverageComparator());
        System.out.println(goodStudents);
        System.out.println("Sort by group them by average");
        goodStudents.sort(new StudentGroupComparator().thenComparing(new StudentAverageComparator()));
        System.out.println(goodStudents);
    }

    private static List<Student> removeBellowAverage3(List<Student> students) {
        return students.stream()
                .filter(student -> student.getAverageGrade() > 3)
                .collect(Collectors.toList());
    }


}
