package module_1.tasks.methods;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int number = 0;
        System.out.print("Enter your 4 digits integer: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (is4Digit(number)) {
                System.out.println(sumTwoHalves(number));
            } else {
                System.out.println("You integer must be less than 10000");
            }
        } else {
            System.out.println("You must input an integer");
        }

    }

    private static int sumTwoHalves(int number) {
        return number / 100 + number % 100;
    }

    private static boolean is4Digit(int number) {
        return number < 10000;
    }
}
