package simple.strategy.payment;

public class Cash implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Оплачено " + amount + " наличными");
    }

    @Override
    public String getPaymentMethodName() {
        return "Наличные";
    }
}