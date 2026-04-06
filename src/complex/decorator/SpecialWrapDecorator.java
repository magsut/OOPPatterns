package complex.decorator;

public class SpecialWrapDecorator extends OrderDecorator {

    public SpecialWrapDecorator(OrderComponent order) {
        super(order);
    }

    @Override
    public String getDescription() {
        return order.getDescription() + ", индивидуальная упаковка";
    }

    @Override
    public double getCost() {
        return order.getCost() + 500.0;
    }
}