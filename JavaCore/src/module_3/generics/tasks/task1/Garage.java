package module_3.generics.tasks.task1;

import java.util.ArrayList;

public class Garage<T extends Vehicle> {
    T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }
}
