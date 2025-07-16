package module_1.tasks.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] a = getRandomArray(10);
        System.out.println(Arrays.toString(a));
        printEvenPositions(a);
    }

    static int[] getRandomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    static void printEvenPositions(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                System.out.println(i + ": " + a[i]);
            }

        }
    }
}
