package module_1.tasks.loops;

public class Task2 {
    public static void main(String[] args) {
        long i = 7893823445L;
        long sum = 0;
        while (i > 0) {
            sum += i % 10;
            i = i / 10;
        }
        System.out.println(i + " has sum of digits: " + sum);
    }
}
