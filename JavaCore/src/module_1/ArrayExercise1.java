package module_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your number:");
        int n = scanner.nextInt();
        int[] a = getRandomArray();
        System.out.println(Arrays.toString(a));
        overrideEvens(a, n);
        System.out.println(Arrays.toString(a));
    }

    static int[] getRandomArray() {
        Random random = new Random();
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }
    static void overrideEvens(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                a[i] = n;
            }
        }
    }
}
