package module_3.enums;

public class EnumsDemo {
    public static void main(String[] args) {
        System.out.println(Day.THUESDAY);
        Day day = Day.FRIDAY;
        System.out.println(day.name());
        System.out.println(day.toString());
        System.out.println(day.ordinal());

        System.out.println(Day.valueOf("THURSDAY"));
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
