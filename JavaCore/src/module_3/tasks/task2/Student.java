package module_3.tasks.task2;

public class Student extends User {
    Integer grant;
    @Override
    protected int getIncome() {
        if (grant != null) return grant;
        return 0;
    }
}
