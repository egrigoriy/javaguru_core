package module_1.tasks.conditions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hole width: ");
        int a = scanner.nextInt();
        System.out.print("Enter hole height: ");
        int b = scanner.nextInt();
        System.out.print("Enter your carton radius: ");
        int r = scanner.nextInt();
        System.out.println("You can cover the hole with carton: " + canCover(a, b, r));
    }

    private static boolean canCover(int a, int b, int r) {
        return r >= Math.max(a, b);
    }
}
