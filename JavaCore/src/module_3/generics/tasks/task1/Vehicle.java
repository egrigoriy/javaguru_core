package module_3.generics.tasks.task1;

public class Vehicle {
    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
