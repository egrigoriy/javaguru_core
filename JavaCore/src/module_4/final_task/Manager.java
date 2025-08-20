package module_4.final_task;

import java.util.*;
import java.util.stream.Collectors;

public class Manager {
    private Cart cart = new Cart();

    public void addProduct(Product product) {
        cart.addProduct(product);
    }
    public void printBill() {
        printBillHeader();
        double total = calculateTotal();
        printBillLines();
        printBillFooter(total);
    }

    private void printBillLines() {
        for (Product product : cart.getAllProducts().keySet()) {
            double unitPrice = product.getPrice();
            int quantity = cart.getAllProducts().get(product);
            double price = quantity * unitPrice;
            System.out.println(product.getName() + " - " + quantity + " x " + unitPrice + " = " + price);
        }
    }

    private double calculateTotal() {
        double total = 0;
        for (Product product : cart.getAllProducts().keySet()) {
            double unitPrice = product.getPrice();
            int quantity = cart.getAllProducts().get(product);
            double price = quantity * unitPrice;
            total += price;
        }
        return total;
    }

    private static void printBillFooter(double total) {
        System.out.println("***************************");
        System.out.println("Total: " + (int) (total * 100) / 100.0 );
        System.out.println("***************************");
    }

    private void printBillHeader() {
        System.out.println("***************************");
        System.out.println("BILL");
        System.out.println("***************************");
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        List<Product> productList = List.of(
                new Product("Milk", 1.22),
                new Product("Chocolate", 1.22),
                new Product("Beef", 2.22),
                new Product("Milk", 1.22),
                new Product("Milk", 3.33),
                new Product("Beef", 2.22),
                new Product("Milk", 1.22)
        );
        for (Product product : productList) {
            manager.addProduct(product);
        }
        manager.printBill();

        manager.cart.getAllProducts().entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue));
        System.out.println(manager.cart.getAllProducts());
    }
}
