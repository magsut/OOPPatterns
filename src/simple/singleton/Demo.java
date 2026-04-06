package simple.singleton;

public class Demo {
    public static void run() {
        System.out.println("\n--- Singleton pattern ---");

        StoreConfig config1 = StoreConfig.getInstance();
        StoreConfig config2 = StoreConfig.getInstance();

        System.out.println("Стартовые настройки:");
        config1.printConfig();

        System.out.println("\nПроверка куда указывают 2 ссылки конфигов 1 и 2:");
        System.out.println("config1 == config2 -> " + (config1 == config2));

        System.out.println("\nИзменение в обьекте config1...");
        config1.setStoreName("SuperShop");
        config1.setCurrency("EUR");
        config1.setTaxRate(0.20);

        System.out.println("\nДанные обьекта config2:");
        config2.printConfig();
    }
}