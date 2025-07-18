package module_3.generics;

public class SuperNumberBox<T extends Number> {
    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
