package module_4.sorting.tasks.task1;

import java.util.Objects;

class Student {
    private String name;
    private String group;
    private double averageGrade;

    public Student(String name, String group, double averageGrade) {
        this.name = name;
        this.group = group;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return Double.compare(averageGrade, student.averageGrade) == 0 && Objects.equals(name, student.name) && Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, averageGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
