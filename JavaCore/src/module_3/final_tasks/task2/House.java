package module_3.final_tasks.task2;

public class House {
    private int temperature;
    private int humidity;

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public House(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "House{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }

    public void increaseTemperature(int value) {
        temperature += value;
    }

    public void increaseHumidity(int value) {
        humidity += value;
    }
}
