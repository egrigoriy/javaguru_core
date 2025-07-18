package module_3.generics.tasks.task1;

import module_3.generics.C;

public class GarageDemo {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        Motorcycle motorcycle = new Motorcycle("Kawasaki");
        Garage<Car> carGarage = new Garage<>(car);
        Garage<Motorcycle> motorcycleGarage = new Garage<>(motorcycle);
        System.out.println(carGarage.vehicle);
        System.out.println(motorcycleGarage.vehicle);
    }
}
