package module_3.tasks.task3;

import java.time.LocalDate;
import java.util.Date;

public class BouquetDemo {

    public static void main(String[] args) {
        Rose rose = new Rose( 20, "White", LocalDate.of(2025, 12, 12), 5);
        Tulip tulip = new Tulip(10, "Yellow", LocalDate.of(2025, 12, 15), 7);
        Carnation carnation = new Carnation(10, "Red",LocalDate.of(2025, 12, 5), 8);

        System.out.println("The total price is: " + rose.getPrice() + tulip.getPrice() + carnation.getPrice());
        System.out.println("Used colors are: " + rose.getColor() + "|" + tulip.getColor() + "|" + carnation.getColor());
    }
}
