package module_1.tasks.loops;

public class Task1 {
    public static void main(String[] args) {
        int n = 1;
        int factorial = 1;
        while (n <= 10) {
            factorial = factorial * n;
            System.out.println(n + "! = " + factorial);
            n++;
        }
    }
}
