package module_3.final_tasks.task2;

public class HVACFactory {
    static HVAC make(HVACType type) {
        if (type == HVACType.HEATER) {
            return new Heater();
        } else {
            return new Humidifier();
        }
    }
}
