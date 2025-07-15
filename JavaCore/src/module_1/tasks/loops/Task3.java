package module_1.tasks.loops;

public class Task3 {
    public static void main(String[] args) {
        int start = 50;
        int end = 70;

        int i;
        boolean isSecondPrime = false;
        for (i = start; i <= end; i++) {
            if (isPrime(i)) {
                if (!isSecondPrime) {
                    isSecondPrime = true;
                } else {
                    break;
                }
            }
        }
        System.out.println("Second prime number between 50 and 70 is: " + i);
    }

    private static boolean isPrime(int i) {
        int end = (int) Math.sqrt(i);
        for (int j = 2; j <= end; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
