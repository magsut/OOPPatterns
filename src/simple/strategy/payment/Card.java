package simple.strategy.payment;

public class Card implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Оплачено " + amount + " используя банковскую карту.");
    }

    @Override
    public String getPaymentMethodName() {
        return "Банковская карта";
    }
}