package module_7.lambda;

public class LambdaLocals {
    public void tryIt() {
        int x = 10;
        int y = 20;
        Operationable op = (a, b) -> {
//            x = 10;
            return a + b;
        };
        //x = 30;
        System.out.println(op.calculate(x, y));
    }
}
