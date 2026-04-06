package simple.observer;

public class Demo {
    public static void run() {
        System.out.println("\n--- Observer pattern ---");

        ProductNotification tvNotification = new ProductNotification("Телевизор");

        Customer customer1 = new Customer("Аня");
        Customer customer2 = new Customer("Влад");
        Customer customer3 = new Customer("Максим");

        tvNotification.addObserver(customer1);
        tvNotification.addObserver(customer2);
        tvNotification.addObserver(customer3);

        System.out.println("\nПервое уведомление:");
        tvNotification.setMessage("Цена упала до 2000");

        System.out.println();

        tvNotification.removeObserver(customer2);

        System.out.println("\nВторое уведомление после отписки Влада:");
        tvNotification.setMessage("Скидка 10% до среды");
    }
}