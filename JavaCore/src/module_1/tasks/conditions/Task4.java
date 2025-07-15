package module_1.tasks.conditions;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your amount: ");
        int amount = scanner.nextInt();
        System.out.println("Your amount is: " + amount + " " + getCurrency(amount));
    }

    private static String getCurrency(int amount) {
        int lastDigit = amount % 10;
        if (lastDigit == 1) return "рубль";
        if (lastDigit == 2 && amount != 12) return "рубля";
        if (lastDigit == 3 && amount != 13) return "рубля";
        if (lastDigit == 4 && amount != 14) return "рубля";
        return "рублей";
    }
}
