package module_3.tasks.task2;

public class UserDemo {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getIncome());
        student.grant = 100;
        System.out.println(student.getIncome());
        Person person = new Person();
        System.out.println(person.getIncome());
        person.salary = 10;
        System.out.println(person.getIncome());
    }
}
