package module_3.oop.tasks.task1;

public class Director extends Worker {
    int bonus = 100000;

    @Override
    int getSalary() {
        return super.getSalary() + bonus;
    }
}
