package module_1.tasks.conditions;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your week day number: ");
        int weekDay = scanner.nextInt();
        if (weekDay >= 1 && weekDay <= 7) {
            System.out.println("Your schedule for " + weekDay + " is: " + getSchedule(weekDay));
        } else {
            System.out.println("Your week day number must be between 1 and 7.");
        }
    }

    private static String getSchedule(int weekDay) {
        switch (weekDay) {
            case 1:
                return "Monday: Buy apples";
            case 2:
                return "Tuesday: Buy bananas";
            case 3:
                return "Wednesday: Buy cocoa";
            case 4:
                return "Thursdays: Buy some drink";
            case 5:
                return "Friday: Buy 5 eggs";
            case 6:
                return "Saturday: Sleep";
            case 7:
                return "Sunday: It's sunny!";
        }
        return "You are not from the Earth!";
    }
}
