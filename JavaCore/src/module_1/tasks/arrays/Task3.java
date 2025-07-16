package module_1.tasks.arrays;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        print2DArray(a);
        System.out.println("-------");
        fillButterfly(a);
        print2DArray(a);
    }

    static void print2DArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }

    static void fillButterfly(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i > 0 && i < 4 && (j == 0 || j == 4)) {
                    a[i][j] = 0;
                } else if ((i == 2 && j == 1) || (i == 2 && j == 3)){
                    a[i][j] = 0;
                } else {
                    a[i][j] = 1;
                }
            }

        }
    }
}
