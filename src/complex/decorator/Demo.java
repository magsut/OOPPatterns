package complex.decorator;

public class Demo {
    public static void run() {
        System.out.println("\n--- Decorator pattern ---");

        OrderComponent order = new BasicOrder("Ноутбук", 100000.0);
        System.out.println(order.getDescription());
        System.out.println("Cost: " + order.getCost());

        System.out.println();

        order = new SpecialWrapDecorator(order);
        order = new ExpressDeliveryDecorator(order);
        order = new InsuranceDecorator(order);

        System.out.println("Updated order:");
        System.out.println(order.getDescription());
        System.out.println("Cost: " + order.getCost());
    }
}