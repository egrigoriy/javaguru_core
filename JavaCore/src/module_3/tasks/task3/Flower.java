package module_3.tasks.task3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Flower {
    private int price;
    private String color;
    private LocalDate arrivalDate;

    private int expirePeriodInDays;
    public Flower(int price, String color, LocalDate arrivalDate, int expirePeriodInDays) {
        this.price = price;
        this.color = color;
        this.arrivalDate = arrivalDate;
        this.expirePeriodInDays = expirePeriodInDays;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getExpirePeriodInDays() {
        return expirePeriodInDays;
    }

    public void setExpirePeriodInDays(int expirePeriodInDays) {
        this.expirePeriodInDays = expirePeriodInDays;
    }
}
