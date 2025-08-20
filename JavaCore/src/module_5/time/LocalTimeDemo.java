package module_5.time;

import java.time.LocalTime;

class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        localTime = LocalTime.of(15, 12, 10);
        System.out.println(localTime);

        localTime = LocalTime.MIDNIGHT;
        System.out.println(localTime);

        localTime = LocalTime.MAX;
        System.out.println(localTime);
    }
}
