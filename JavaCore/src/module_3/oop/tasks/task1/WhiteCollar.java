package module_3.oop.tasks.task1;

public class WhiteCollar extends Worker {
    int bonus = 1000;

    @Override
    int getSalary() {
        return super.getSalary() + bonus;
    }
}
