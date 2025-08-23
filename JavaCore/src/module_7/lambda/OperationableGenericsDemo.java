package module_7.lambda;

public class OperationableGenericsDemo {
    public static void main(String[] args) {
        OperationableG<Integer> sum = (x, y) -> x + y;
        OperationableG<String> concat = (x, y) -> x + y;
        System.out.println(sum.calculate(5, 4));
        System.out.println(concat.calculate("5", "4"));
    }
}
