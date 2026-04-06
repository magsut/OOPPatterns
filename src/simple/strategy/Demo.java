package simple.strategy;

import simple.strategy.payment.Card;
import simple.strategy.payment.Cash;
import simple.strategy.payment.FastPaymentSystem;

import java.util.UUID;

public class Demo {
    public static void run() {
        System.out.println("\n--- Strategy pattern ---");

        Order order = new Order("ORD-" + UUID.randomUUID(), 1250.5);

        order.setPaymentStrategy(new Card());
        order.processPayment();

        System.out.println();

        order.setPaymentStrategy(new Cash());
        order.processPayment();

        System.out.println();

        order.setPaymentStrategy(new FastPaymentSystem());
        order.processPayment();
    }
}