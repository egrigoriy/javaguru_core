package module_1.tasks.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] a = getRandomArray(10);
        System.out.println(Arrays.toString(a));
        int index = findIndexOfMax(a);
        System.out.println(index);
    }

    static int[] getRandomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    static int findIndexOfMax(int[] a) {
        int max = a[0];
        int indexOfMax = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }
}
