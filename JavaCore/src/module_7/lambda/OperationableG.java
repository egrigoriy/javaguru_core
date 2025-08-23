package module_7.lambda;

@FunctionalInterface
public interface OperationableG<T> {
    T calculate(T x, T y);
}
