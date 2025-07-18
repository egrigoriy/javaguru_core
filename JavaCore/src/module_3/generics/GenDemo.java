package module_3.generics;

public class GenDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        Gen<A> genA = new Gen<>(a);
        Gen<B> genB = new Gen<>(b);
        Gen<C> genC = new Gen<>(c);
        genC.printExtendsA(genC);
        genC.printExtendsA(genA);
        genC.printSuperB(genB);
    }
}
