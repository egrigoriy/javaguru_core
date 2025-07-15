package module_1.tasks.methods;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int number = 0;

        System.out.print("Enter an integer: ");
        Scanner scanner = new Scanner(System.in);

       if (scanner.hasNextInt()) {
           number = scanner.nextInt();
           System.out.println(getLastDigit(number));
       } else {
           System.out.println("You must enter an integer!");
       }
    }

    private static int getLastDigit(int number) {
        return number % 10;
    }
}
