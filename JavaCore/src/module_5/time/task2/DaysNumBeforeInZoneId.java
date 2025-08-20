package module_5.time.task2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DaysNumBeforeInZoneId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of days:");
        int dayNum = scanner.nextInt();
        ZoneId zoneId = ZoneId.of("Asia/Yerevan");
        LocalDateTime now = LocalDateTime.now(zoneId);
        LocalDateTime daysBeforeNow = now.minusDays(dayNum);
        System.out.println(daysBeforeNow.format(DateTimeFormatter.ofPattern("d MMMM uuuu HH:mm")));

    }
}
