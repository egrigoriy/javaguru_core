package module_3.final_tasks.task2;

public class HouseManager {
    public static void main(String[] args) {
        House house = new House(20, 60);
        System.out.println(house);
        HVAC heater = HVACFactory.make(HVACType.HEATER);
        HVAC humidifier = HVACFactory.make(HVACType.HUMIDIFIER);
        heater.execute(4, house);
        System.out.println(house);
        heater.execute(2, house);
        System.out.println(house);
        humidifier.execute(3, house);
        System.out.println(house);
        humidifier.execute(5, house);
        System.out.println(house);
    }
}
