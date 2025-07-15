package module_1.tasks.methods;

public class Task2 {
    public static void main(String[] args) {
        long result = doIt(3, 4);
        System.out.println(result);
    }

    private static long doIt(int a, int b) {
        return (a + b) + ((long) a * b);
    }

}
