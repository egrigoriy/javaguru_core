package module_2.tasks.strings;

public class Task2 {
    public static void main(String[] args) {
        int iterations = 100000;
        String s = "";
        long start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            s += "aaabbbccc";
        }
        long end = System.nanoTime();
        double elapsedTime = (end - start) / 1e9;
        System.out.println("String concatenation: " + elapsedTime);


        StringBuilder sb = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        end = System.nanoTime();
        elapsedTime = (end - start) / 1e9;
        System.out.println("String builder concatenation: " + elapsedTime);
    }
}
