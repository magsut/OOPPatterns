package simple.factory;

import simple.factory.products.Product;

public class Demo {
    public static void run() {
        System.out.println("\n--- Factory Method pattern ---");

        Product product1 = ProductFactory.createProduct("book", "Учебник по программированию", 1000);
        Product product2 = ProductFactory.createProduct("electronics", "Графический ускоритель", 15999.9);
        Product product3 = ProductFactory.createProduct("clothing", "Футболка", 2599);

        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
    }
}