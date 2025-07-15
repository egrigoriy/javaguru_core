package module_1.tasks.conditions;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input coefficient a:");
        int a = scanner.nextInt();
        System.out.println("Input coefficient b:");
        int b = scanner.nextInt();
        System.out.println("Input coefficient c:");
        int c = scanner.nextInt();
        System.out.println("Your equation is: " + a + "*x2 " + b + "*x " + c);
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminant == 0) {
            double x12 = (-b) / (2.0 * a);
            System.out.println("x1 = x2 = " + x12);
        } else {
            System.out.println("No roots.`");
        }
    }
}
