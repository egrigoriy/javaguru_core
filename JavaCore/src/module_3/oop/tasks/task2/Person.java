package module_3.oop.tasks.task2;

public class Person extends Student {
    Integer salary;

    @Override
    protected int getIncome() {
        if (salary != null) {
            return super.getIncome() + salary;
        }
        return super.getIncome();
    }
}
