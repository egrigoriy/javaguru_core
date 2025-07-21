package module_3.enums.task1;


enum Months {
    JANUARY("Cold", 31),
    FEBRUARY("Cold", 28),
    MARCH("Warmer", 31),
    ;


    private String description;
    private int countOfDays;

    Months(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public Months getNext() {
        return Months.values()[this.ordinal() + 1];
    }
}
public class MonthsDemo {
    public static void main(String[] args) {
        for (Months month : Months.values()) {
            System.out.println(month + " : " + month.getDescription() + " : " + month.getCountOfDays());
        }
        Months feb = Months.FEBRUARY;
        System.out.println("Next after " + feb + " is " + feb.getNext());
    }
}
