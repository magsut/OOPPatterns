package simple.strategy.payment;

public interface PaymentStrategy {
    void pay(double amount);
    String getPaymentMethodName();
}