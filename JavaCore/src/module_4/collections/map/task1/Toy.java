package module_4.collections.map.task1;

import java.util.Objects;

class Toy {
    private String name;
    private int fromAge;
    private double price;

    public Toy(String name, int fromAge, double price) {
        this.name = name;
        this.fromAge = fromAge;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Toy toy)) return false;
        return fromAge == toy.fromAge && Double.compare(price, toy.price) == 0 && Objects.equals(name, toy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, fromAge, price);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", fromAge=" + fromAge +
                ", price=" + price +
                '}';
    }
}
