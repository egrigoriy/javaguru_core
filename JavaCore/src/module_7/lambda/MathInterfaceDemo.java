package module_7.lambda;

public class MathInterfaceDemo {
    public static void main(String[] args) {
        MathInterface<Integer> m = (x, y) -> x > y ? x : y;

        System.out.println(m.getMax(3, 5));
        System.out.println(m.getMax(9, 5));
    }
}

@FunctionalInterface
interface MathInterface<T> {
    T getMax(T x, T y);
}
