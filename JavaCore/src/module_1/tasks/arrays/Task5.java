package module_1.tasks.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Input array size:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = getRandomArray(size);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(removeLocalMax(a)));
    }

    static int[] getRandomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    static Object[] removeLocalMax(int[] a) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            int prev = Math.max(0, i - 1);
            int next = Math.min(i+1, a.length - 1);
            if (a[i] >= a[prev] && a[i] >= a[next]) {
                continue;
            }
            result.add(a[i]);
        }
        return result.toArray();
    }
}
