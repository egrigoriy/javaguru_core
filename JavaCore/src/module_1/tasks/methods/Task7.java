package module_1.tasks.methods;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your first point x-coordinate: ");
        int x1 = scanner.nextInt();
        System.out.print("Input your first point y-coordinate: ");
        int y1 = scanner.nextInt();
        System.out.print("Input your second point x-coordinate: ");
        int x2 = scanner.nextInt();
        System.out.print("Input your second point y-coordinate: ");
        int y2 = scanner.nextInt();

        System.out.println(getDistance(x1, y1, x2, y2));
    }

    private static double getDistance(int x1, int y1, int x2, int y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
