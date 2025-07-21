package module_3.final_tasks.task2;

public class Humidifier extends HVAC {

    public void execute(int value, House house) {
        house.increaseHumidity(value);
    }
}
