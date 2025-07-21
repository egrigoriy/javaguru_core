package module_3.runtime;

import javax.management.timer.Timer;

public class RuntimeDemo {
    static Runtime runtime = Runtime.getRuntime();
    public static void main(String[] args) {
        System.out.println("Nrb processors: "  + runtime.availableProcessors());
        printMemory();
        for (int i = 0; i < 100000000; i++) {
           new Foo(i);
        }

        printMemory();
    }

    static void printMemory() {
        System.out.println("Max memory in MB:" + runtime.maxMemory() / 1e6);
        System.out.println("Total memory in MB: " + runtime.totalMemory() / 1e6);
        System.out.println("Free memory in MB: " + runtime.freeMemory() / 1e6);
        System.out.println("Used memory in MB: " + (runtime.totalMemory() - runtime.freeMemory()) / 1e6);
        System.out.println("____________________________");
    }
}
