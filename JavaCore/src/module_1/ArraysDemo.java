package module_1;

import java.util.Arrays;
import java.util.Random;

public class ArraysDemo {
    public static void main(String[] args) {
       fillWithConst();
       fillWithRandom();
       addNumberToAllElements();
       forEachExample();
       findMax();
       multiArray();
    }

    static void fillWithConst() {
        int[] a = new int[10];
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            a[i] = 10;
        }
        System.out.println(Arrays.toString(a));
    }

    static void fillWithRandom() {
        Random random = new Random();
        int[] a = new int[5];
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(a));
    }
    static void addNumberToAllElements() {
        Random random = new Random();
        int[] a = new int[5];
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            a[i] += 10;
        }
        System.out.println(Arrays.toString(a));
    }

    static void forEachExample() {
        Random random = new Random();
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        for (int el : a) {
            System.out.print(el % 10);
            System.out.print(" ");
        }
    }
    static void findMax() {
        Random random = new Random();
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        int max = a[0];
        for (int el : a) {
            if (el > max) {
                max = el;
            }
        }
        System.out.println(max);
    }

    static void multiArray() {
        int[][] a = new int[2][2];
        a[0][0] = 1;
        a[0][1] = 2;
        a[1][0] = 3;
        a[1][1] = 4;
        System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(a[1]));
    }
}
