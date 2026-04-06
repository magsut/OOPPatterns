package simple.factory.products;

import java.util.UUID;

public class Book implements Product {
    private final UUID id;
    private final String name;
    private final double price;

    public Book(String name, double price, UUID id) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getId() {
        return id.toString();
    }

    @Override
    public void showInfo() {
        System.out.println("Book: " + name + ", price: " + price + ", id: " + id);
    }
}