package complex.command;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public List<String> getItems() {
        return items;
    }

    public void showItems() {
        if (items.isEmpty()) {
            System.out.println("Корзина пустая.");
            return;
        }

        System.out.println("Корзина содержит:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }

    public void clear() {
        items.clear();
    }
}