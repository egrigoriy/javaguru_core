package module_3.generics;

public class BoxDemo {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        Box<String> box2 = new Box<>();
        box1.setItem(123);
        box2.setItem("Hello");
        System.out.println(box1.getItem());
        System.out.println(box2.getItem());
    }
}
