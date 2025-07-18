package module_3.oop.tasks.task1;

public class FactoryDemo {

    public static void main(String[] args) {
        Worker worker = new Worker();
        WhiteCollar engineer = new WhiteCollar();
        Director director = new Director();

        System.out.println(worker.getSalary());
        System.out.println(engineer.getSalary());
        System.out.println(director.getSalary());
    }
}
