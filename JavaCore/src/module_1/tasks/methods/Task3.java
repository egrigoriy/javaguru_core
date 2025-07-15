package module_1.tasks.methods;

import java.util.Scanner;

public class Task3 {
    private static final int SEC_PER_MINUTE = 60;
    public static final int SEC_PER_HOUR = 60 * SEC_PER_MINUTE;
    public static final int SEC_PER_DAY = 24 * SEC_PER_HOUR;
    public static final int SEC_PER_WEEK = 7 * SEC_PER_DAY;

    public static void main(String[] args) {
        System.out.println("Input seconds:");
        Scanner scanner = new Scanner(System.in);
        int inputSec = scanner.nextInt();
        printFormattedTime(inputSec);
    }

    static void printFormattedTime(int inputSec) {
        int weeks = inputSec / SEC_PER_WEEK;
        int days = (inputSec - weeks * SEC_PER_WEEK) / SEC_PER_DAY;
        int hours = (inputSec - weeks * SEC_PER_WEEK - days * SEC_PER_DAY) / SEC_PER_HOUR;
        int minutes = (inputSec - weeks * SEC_PER_WEEK - days * SEC_PER_DAY - hours * SEC_PER_HOUR) / SEC_PER_MINUTE;
        int seconds = inputSec % 60;
        System.out.println("weeks: " + weeks + ", days: " + days + ", hours: " + hours + ", minutes: " + minutes + ", seconds: " + seconds);
    }


}
