package module_3.generics;

public class Gen<T> {
    T obj;

    public Gen(T obj) {
        this.obj = obj;
    }

    void printExtendsA(Gen<? extends A> o) {
        System.out.println(o);
    }

    void printSuperB(Gen<? super B> o) {
        System.out.println(o);
    }

    @Override
    public String toString() {
        return "Gen{" +
                "obj=" + obj +
                '}';
    }
}
