package module_7.lambda;

public class OperationableDemo {
    public static void main(String[] args) {
        Operationable sum = (x, y) -> x + y;
        Operationable sub = (x, y) -> x - y;

        System.out.println(sum.calculate(5, 4));
        System.out.println(sub.calculate(5, 4));

        Operationable mult = new Operationable() {
            @Override
            public int calculate(int x, int y) {
                return x * y;
            }
        };
        System.out.println(mult.calculate(5, 4));
    }
}
