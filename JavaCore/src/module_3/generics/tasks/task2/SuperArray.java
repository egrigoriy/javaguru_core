package module_3.generics.tasks.task2;


import java.util.ArrayList;

public class SuperArray<T extends Number> {
    T[] array;

    public void setArray(T[] array) {
        this.array = array;
    }

    public T getElementByIndex(int index) {
       return (index >= 0) && (index < array.length) ? array[index] : null;
    }

    public static void main(String[] args) {
        SuperArray<Integer> integerSuperArray = new SuperArray<>();
        SuperArray<Long> longSuperArray = new SuperArray<>();

        integerSuperArray.setArray(new Integer[]{4, 3, 2, 1});
        longSuperArray.setArray(new Long[]{12L, 321L, 709L});

        System.out.println(integerSuperArray.getElementByIndex(2));
        System.out.println(integerSuperArray.getElementByIndex(9));
        System.out.println(longSuperArray.getElementByIndex(1));
        System.out.println(longSuperArray.getElementByIndex(4));
    }
}
