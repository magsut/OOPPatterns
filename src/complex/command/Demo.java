package complex.command;

public class Demo {
    public static void run() {
        System.out.println("\n--- Command pattern ---");

        Cart cart = new Cart();
        StoreService storeService = new StoreService(cart);
        Button button = new Button();

        button.setCommand(new AddToCartCommand(storeService, "Ноутбук"));
        button.press();

        button.setCommand(new AddToCartCommand(storeService, "Мышь"));
        button.press();

        button.setCommand(new AddToCartCommand(storeService, "Клавиатура"));
        button.press();

        System.out.println();
        cart.showItems();

        System.out.println();

        button.setCommand(new RemoveFromCartCommand(storeService, "Мышь"));
        button.press();

        System.out.println();
        cart.showItems();

        System.out.println();

        button.setCommand(new CheckoutCommand(storeService));
        button.press();

        System.out.println();

        cart.showItems();
    }
}