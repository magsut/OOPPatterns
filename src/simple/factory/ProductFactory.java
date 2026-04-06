package simple.factory;

import simple.factory.products.Book;
import simple.factory.products.Clothing;
import simple.factory.products.Electronics;
import simple.factory.products.Product;

import java.util.UUID;

public class ProductFactory {

    public static Product createProduct(String type, String name, double price) {
        if (type == null) {
            throw new IllegalArgumentException("Product type cannot be null");
        }

        return switch (type.toLowerCase()) {
            case "book" -> new Book(name, price, UUID.randomUUID());
            case "electronics" -> new Electronics(name, price, UUID.randomUUID());
            case "clothing" -> new Clothing(name, price, UUID.randomUUID());
            default -> throw new IllegalArgumentException("Unknown product type: " + type);
        };
    }
}