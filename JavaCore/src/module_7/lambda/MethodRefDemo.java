package module_7.lambda;

public class MethodRefDemo {
    public static void main(String[] args) {
        Printable p = MyClass::hello;
        p.print();
        Printable p2 = (new MyClass())::bye;
        p2.print();
    }
}

@FunctionalInterface
interface Printable {
    void print();
}
class MyClass {
    static void hello() {
        System.out.println("Hello!!!");
    }

    void bye() {
        System.out.println("Bye!!");
    }
}
