package complex.command;

public class StoreService {
    private final Cart cart;

    public StoreService(Cart cart) {
        this.cart = cart;
    }

    public void addToCart(String item) {
        cart.addItem(item);
        System.out.println("Добавлено в корзину: " + item);
    }

    public void removeFromCart(String item) {
        cart.removeItem(item);
        System.out.println("Удалено из корзины: " + item);
    }

    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Не удается оформить заказ: корзина пуста.");
            return;
        }

        System.out.println("Оформление заказа завершено. Заказанные товары:");
        cart.getItems().forEach(System.out::println);
        cart.clear();
    }
}