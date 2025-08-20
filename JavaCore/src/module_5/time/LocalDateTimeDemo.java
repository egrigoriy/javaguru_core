package module_5.time;

import java.time.LocalDateTime;
import java.time.ZoneId;

class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.MAX;
        System.out.println(localDateTime);

        localDateTime = LocalDateTime.MIN;
        System.out.println(localDateTime);

        ZoneId zone1 = ZoneId.of("Asia/Tokyo");
        localDateTime = LocalDateTime.now(zone1);
        System.out.println(localDateTime);
    }
}
