package module_7.lambda;

public class RunnableDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Hello from thread!!!"));
        thread.start();
    }
}
