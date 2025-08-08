package module_4.collections;

import java.util.ArrayList;


public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        System.out.println("first is: " + arrayList.get(0));
        arrayList.remove(0);
        System.out.println("first is: " + arrayList.get(0));
    }



}
