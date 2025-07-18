package module_3.transport;

public abstract class Transport {
    public void honk(){
        System.out.println("Bee-beep!");
    }

    public void honk(String msg) {
        System.out.println(msg);
    }

    public void honk(String msg, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(msg);
        }
    }

    public abstract void refuel(int liters);

    public abstract void mode(String destination);
}
