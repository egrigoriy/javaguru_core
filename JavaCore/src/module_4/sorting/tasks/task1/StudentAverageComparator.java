package module_4.sorting.tasks.task1;

import java.util.Comparator;
import java.util.Map;

class StudentAverageComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        double epsilon = 0.01;
        if (Math.abs(o1.getAverageGrade()) - Math.abs(o2.getAverageGrade()) < epsilon) {
            return 0;
        }
        if (o1.getAverageGrade() < o2.getAverageGrade()) {
            return 1;
        }
        return -1;
    }
}
