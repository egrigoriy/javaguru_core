package module_3.final_tasks.task2;

public class Heater extends HVAC {
    public void execute(int value, House house) {
        house.increaseTemperature(value);
    }
}
