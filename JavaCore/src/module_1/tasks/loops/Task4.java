package module_1.tasks.loops;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of people: ");
        int people = scanner.nextInt();
        System.out.println("Input number of pieces per pizza: ");
        int piecesPerPizza = scanner.nextInt();
        System.out.println("Number of pizza you must order at least is: " + calculatePizza(people, piecesPerPizza));
    }

    private static int calculatePizza(int people, int piecesPerPizza) {
        if (piecesPerPizza % people == 0) return 1;
        int pizza = 1;
        while (pizza * piecesPerPizza % people != 0) {
            pizza++;
        }
        return pizza;
    }
}