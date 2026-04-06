package simple.strategy.payment;

public class FastPaymentSystem implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Оплачено " + amount + " используя СБП.");
    }

    @Override
    public String getPaymentMethodName() {
        return "Система Быстрых Платежей";
    }
}