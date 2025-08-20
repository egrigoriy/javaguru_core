package module_5.time.task1;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PrintInputMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input current month number [1-12]:");
        int inputCurrentMonth = scanner.nextInt();

        LocalDate firstDayOfCurrentMonth = LocalDate.of(LocalDate.now().getYear(), inputCurrentMonth, 1);
        firstDayOfCurrentMonth.datesUntil(firstDayOfCurrentMonth.plusMonths(1))
                .map(date -> date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")))
                .forEach(System.out::println);
    }
}
