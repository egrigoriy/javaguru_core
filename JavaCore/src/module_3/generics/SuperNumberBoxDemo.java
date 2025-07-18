package module_3.generics;

import javax.print.DocFlavor;

public class SuperNumberBoxDemo {
    public static void main(String[] args) {
        SuperNumberBox<Integer> intBox = new SuperNumberBox<>();
        SuperNumberBox<Double> doubleBox = new SuperNumberBox<>();
        intBox.setItem(123);
        doubleBox.setItem(123.0);
        System.out.println(intBox.getItem());
        System.out.println(doubleBox.getItem());
    }
}
