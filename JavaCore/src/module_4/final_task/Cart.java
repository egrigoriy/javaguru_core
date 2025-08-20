package module_4.final_task;

import java.util.HashMap;

public class Cart {
    private HashMap<Product, Integer> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product, products.getOrDefault(product, 0) + 1);
    }

    public HashMap<Product, Integer> getAllProducts() {
        return products;
    }
}
