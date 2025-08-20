package module_4.sorting.tasks.task1;

import java.util.Comparator;

class StudentGroupComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGroup().compareTo(o2.getGroup());
    }
}
