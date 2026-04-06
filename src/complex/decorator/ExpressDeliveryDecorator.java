package complex.decorator;

public class ExpressDeliveryDecorator extends OrderDecorator {

    public ExpressDeliveryDecorator(OrderComponent order) {
        super(order);
    }

    @Override
    public String getDescription() {
        return order.getDescription() + ", приоритетная доставка";
    }

    @Override
    public double getCost() {
        return order.getCost() + 1500.0;
    }
}