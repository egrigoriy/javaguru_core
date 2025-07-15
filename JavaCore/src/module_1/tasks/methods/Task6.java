package module_1.tasks.methods;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int number = 0;
        System.out.print("Enter your 5 digits integer: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (is5Digit(number)) {
                System.out.println(get3rdDigit(number));
            } else {
                System.out.println("You integer must be less than 100000");
            }
        } else {
            System.out.println("You must input an integer");
        }
    }

    private static int get3rdDigit(int number) {
        return getLastDigit(number / 100);
    }


    private static boolean is5Digit(int number) {
        return number < 100000;
    }

    private static int getLastDigit(int number) {
        return number % 10;
    }
}
