package module_5.time;

import java.time.LocalDate;
import java.time.Month;

class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2022, 12, 12);
        System.out.println(localDate);

        localDate = LocalDate.of(2022, Month.FEBRUARY, 21);
        System.out.println(localDate);

        localDate = LocalDate.ofEpochDay(365);
        System.out.println(localDate);
    }
}
