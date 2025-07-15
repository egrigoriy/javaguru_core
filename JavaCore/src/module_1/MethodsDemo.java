package module_1;

public class MethodsDemo {
    public static void main(String[] args) {
        int j = 3;
        boolean result = isEven(j);
        System.out.println(result);
        print("Is 48 even: " + isEven(48));
        printDefault();
    }

    public static boolean isEven(int i) {
        return (i % 2) == 0;
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static void printDefault() {
        System.out.println("Print default!");
    }
}
