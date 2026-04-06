package simple.strategy;

import simple.strategy.payment.PaymentStrategy;

public class Order {
    private final String orderNumber;
    private final double totalAmount;
    private PaymentStrategy paymentStrategy;

    public Order(String orderNumber, double totalAmount) {
        this.orderNumber = orderNumber;
        this.totalAmount = totalAmount;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment() {
        if (paymentStrategy == null) {
            System.out.println("Метод оплаты не выбран для заказа " + orderNumber);
            return;
        }

        System.out.println("Заказ: " + orderNumber);
        System.out.println("Выбранный метод оплаты: " + paymentStrategy.getPaymentMethodName());
        paymentStrategy.pay(totalAmount);
    }
}