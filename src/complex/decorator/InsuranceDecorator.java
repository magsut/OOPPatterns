package complex.decorator;

public class InsuranceDecorator extends OrderDecorator {

    public InsuranceDecorator(OrderComponent order) {
        super(order);
    }

    @Override
    public String getDescription() {
        return order.getDescription() + ", страховка";
    }

    @Override
    public double getCost() {
        return order.getCost() + 10000.0;
    }
}