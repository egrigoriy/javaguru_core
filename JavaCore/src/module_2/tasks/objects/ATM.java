package module_2.tasks.objects;

import java.util.Scanner;

public class ATM {
    int tray20;
    int tray50;
    int tray100;

    public ATM(int tray20, int tray50, int tray100) {
        this.tray20 = tray20;
        this.tray50 = tray50;
        this.tray100 = tray100;
    }

    public void fill20(int count) {
        tray20 += count;
    }

    public void fill50(int count) {
        tray50 += count;
    }

    public void fill100(int count) {
        tray100 += count;
    }

    public void withdraw(int amount) {
        System.out.println("Your amount was: " + amount);
        int banknote100 = amount / 100;
        int banknote50 = (amount - 100 * banknote100) / 50;
        int banknote20 = (amount - 100 * banknote100 - 50 * banknote50) / 20;
        int rest = amount - 100 * banknote100 - 50 * banknote50 - 20 * banknote20;
        if (rest != 0) {
            System.out.println("FAIL");
            return;
        }
        System.out.println("SUCCESS!");
        System.out.println(banknote100 + " times " + 100);
        System.out.println(banknote50 + " times " + 50);
        System.out.println(banknote20 + " times " + 20);
        this.tray100 -= banknote100;
        this.tray50 -= banknote50;
        this.tray20 -= banknote20;
    }

    public static void main(String[] args) {
        ATM atm = new ATM(9, 9, 9);
        atm.fill20(1);
        atm.fill50(1);
        atm.fill100(1);
        Scanner scanner = new Scanner(System.in);
        int amount;
        System.out.print("Input amount to withdraw: ");
        amount = scanner.nextInt();
        while (amount > 0) {
            atm.withdraw(amount);
            System.out.print("Input amount to withdraw: ");
            amount = scanner.nextInt();
        }
    }
}
