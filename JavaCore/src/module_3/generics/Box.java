package module_3.generics;

public class Box<T> {
    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
