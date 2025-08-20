package module_5.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class LocalDateFormating {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Now: " + date);
        System.out.println("Format now: " + date.format(DateTimeFormatter.ofPattern("dd.MMMM.uuuu")));
        System.out.println("Basic ISO Format now: " + date.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println("Basic ISO format now: " + dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
    }
}
