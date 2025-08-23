package module_7.lambda;

public class LambdaLocalsDemo {
    static int x = 10;
    static int y = 20;
    public static void main(String[] args) {
        Operationable sum2 = (x, y) -> {
            x = 20;
            return x + y;
        };
        System.out.println(sum2.calculate(x, y));
    }
}
